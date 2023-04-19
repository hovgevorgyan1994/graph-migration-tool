package org.plx.graph.migration.tool.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.mongodb.reactivestreams.client.MongoClient;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReactiveMongoTemplateFactoryImpl implements ReactiveMongoTemplateFactory {

    private final Map<String, ReactiveMongoTemplate> cache;
    private final MongoClient mongoClient;

    public ReactiveMongoTemplateFactoryImpl(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override
    public ReactiveMongoTemplate reactiveMongoTemplate(String database) {
        return cache.computeIfAbsent(database, d -> new ReactiveMongoTemplate(mongoClient, d));
    }
}
