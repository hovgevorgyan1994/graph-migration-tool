package org.plx.graph.migration.tool.processor;

import lombok.RequiredArgsConstructor;
import org.plx.graph.migration.tool.dto.EdgeEntity;
import org.plx.graph.migration.tool.dto.MappedEntitiesHolder;
import org.plx.graph.migration.tool.input.MongoReader;
import org.plx.graph.migration.tool.output.GraphProcessor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class MigrationProcessor {

    private final MongoReader mongoReader;
    private final GraphProcessor<EdgeEntity> edgeProcessor;
    private final GraphProcessor<MappedEntitiesHolder> mappedEntitiesProcessor;

    public Mono<Void> process() {
        return mongoReader.edgeEntities()
            .flatMap(e -> edgeProcessor.process(Mono.just(e)))
            .then(processMappings());
    }

    private Mono<Void> processMappings() {
        return mongoReader.mappedEntities()
            .flatMap(e -> mappedEntitiesProcessor.process(Mono.just(e)))
            .then();
    }
}
