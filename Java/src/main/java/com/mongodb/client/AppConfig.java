package com.mongodb.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class MongoClients {
    @Configuration
    public class AppConfig {

        /*
         * Use the standard Mongo driver API to create a com.mongodb.client.MongoClient instance.
         */
        public @Bean
        MongoClient mongoClient() {
            return MongoClients.create("mongodb://localhost:27017");
        }
    }
}
