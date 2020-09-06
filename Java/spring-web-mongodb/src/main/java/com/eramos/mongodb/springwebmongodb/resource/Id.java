package com.eramos.mongodb.springwebmongodb.resource;

import java.util.UUID;

public class Id {
    public static Integer id(){
        return UUID.randomUUID().hashCode();
    }
    public static Integer id(String name){ return name.hashCode(); }
}
