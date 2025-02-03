package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {
        System.out.println("DEFAULT_INITIAL_CAPACITY of Map");
        System.out.println(1<<4);

        // when we don't know K,V type/ type of data we are going to provide
        Map m = new HashMap<>();
        m.put(1,"baba");
        m.put("babi",2);

        // when weknow K,V type/ type of data we are going to provide
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"baba");
        map.put(2,"babi");

        //retrieval of map data using Java 8
        System.out.println("\nretrieval of map data using Java 8");
        map.forEach((k,v) -> System.out.println("Key: "+ k + " Value:"+ v) );

        //retrieval of map data using Set
        System.out.println("\nretrieval of map data using Set");
        Set<Map.Entry<Integer,String>> setOfKeyAndValue = map.entrySet();
        for (Map.Entry<Integer,String > entryOfKeyAndValue : setOfKeyAndValue){
            System.out.println(
                   "Key: " + entryOfKeyAndValue.getKey() + " " +
                           "Value: " +entryOfKeyAndValue.getValue()
            );
        }
    }}
