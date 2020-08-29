package com.mongodb.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    /*
     * Use the standard Mongo driver API to create a com.mongodb.client.MongoClient instance.
     */
    public @Bean
    AppConfig mongoClient() {
        return com.mongodb.client.AppConfig.create("mongodb://localhost:27017");
    }
}

