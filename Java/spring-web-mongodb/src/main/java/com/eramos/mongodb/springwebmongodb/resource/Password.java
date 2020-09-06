package com.eramos.mongodb.springwebmongodb.resource;

import java.security.SecureRandom;

public class Password {

    public static String getSalt(){
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        return String.valueOf(bytes);
    }

    public static int getHash(String input, String salt){
        return (input+salt).hashCode();
    }
}
