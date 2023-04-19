package org.plx.graph.migration.tool.output;

import reactor.core.publisher.Mono;

public interface GraphProcessor<T> {
    Mono<Void> process(Mono<T> edgeEntityMono);
}
