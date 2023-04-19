package org.plx.graph.migration.tool.input;

import org.plx.graph.migration.tool.dto.EdgeEntity;
import org.plx.graph.migration.tool.dto.MappedEntitiesHolder;
import reactor.core.publisher.Flux;

public interface MongoReader {
    Flux<EdgeEntity> edgeEntities();

    Flux<MappedEntitiesHolder> mappedEntities();
}
