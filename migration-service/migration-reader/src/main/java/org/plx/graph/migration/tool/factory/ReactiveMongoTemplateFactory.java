package org.plx.graph.migration.tool.factory;

import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

public interface ReactiveMongoTemplateFactory {

    ReactiveMongoTemplate reactiveMongoTemplate(String database);
}
