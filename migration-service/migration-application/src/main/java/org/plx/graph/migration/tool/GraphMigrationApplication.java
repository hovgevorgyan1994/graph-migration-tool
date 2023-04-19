package org.plx.graph.migration.tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.plx.graph.migration.tool")
public class GraphMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphMigrationApplication.class, args);
    }
}
