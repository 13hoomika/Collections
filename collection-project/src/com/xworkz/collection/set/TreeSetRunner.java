package com.xworkz.collection.set;

import java.util.*;

public class TreeSetRunner {
    public static void main(String[] args) {
        System.out.println("\n============= Set TreeSet =============");
        Set<String> collection= new TreeSet();
        collection.add("Baba");
        collection.add("Babi");
        collection.add("Babu");

        for (Object object : collection)
            System.out.println(object);

        /* TreeSet internally use TreeMap

        */


    }
}
