package org.plx.graph.migration.tool.cache;

import java.util.List;

import reactor.core.publisher.Mono;

public interface CacheTemplate<K, V extends List<?>> {

    Mono<V> get(K key);

    Mono<V> put(K key, V values);

    Mono<?> add(K key, Object value);

    Mono<Void> remove(K key);

    Mono<Void> drop();
}
