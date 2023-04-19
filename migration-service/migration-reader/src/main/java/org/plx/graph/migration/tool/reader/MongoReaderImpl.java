package org.plx.graph.migration.tool.reader;

import java.util.List;

import com.mongodb.reactivestreams.client.MongoClient;
import lombok.RequiredArgsConstructor;
import org.plx.graph.migration.tool.cache.CacheTemplate;
import org.plx.graph.migration.tool.dto.EdgeEntity;
import org.plx.graph.migration.tool.dto.MappedEntitiesHolder;
import org.plx.graph.migration.tool.factory.ReactiveMongoTemplateFactory;
import org.plx.graph.migration.tool.input.MongoReader;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class MongoReaderImpl implements MongoReader {

    private final CacheTemplate<String, List<String>> databaseCache;
    private final CacheTemplate<String, List<String>> groupedNodesCache;
    private final ReactiveMongoTemplateFactory mongoTemplateFactory;
    private final MongoClient mongoClient;

    @Override
    public Flux<EdgeEntity> edgeEntities() {
        return null;
    }

    @Override
    public Flux<MappedEntitiesHolder> mappedEntities() {
        return null;
    }
}
