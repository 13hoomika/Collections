package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class UnderstandingMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("baba",1);
        map.put("babi",2);


        map.forEach((k,v) -> System.out.println("Key: "+ k + " Value:"+ v));

        int hashCodeOfKey = "baba".hashCode();
        System.out.println("hashCode of key: "+ hashCodeOfKey);

        int hash = hashCodeOfKey ^ (hashCodeOfKey >>> 16);
        System.out.println("hash: " + hash);

        int index = hashCodeOfKey & (16-1);
        System.out.println("index: "+ index);

        System.out.println("------------ null key -----------------");
        Map ref = new HashMap();
        ref.put(null,"value for null key");
        System.out.println(ref);

        Object value = ref.get(null);
        System.out.println(value);

    System.out.println("------------ null value -----------------");
        Map ref1 = new HashMap();
        ref1.put("key",null);
        System.out.println(ref1);

        Object value1 = ref.get("key");
        System.out.println(value1);


    }
}
