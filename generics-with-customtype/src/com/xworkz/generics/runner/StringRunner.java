package com.xworkz.generics.runner;

import java.util.ArrayList;
import java.util.Collections;

public class StringRunner {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Adhi");
        collection.add("Poornima");
        collection.add("Neeraja");
        collection.add("Kavya");
        collection.add("Bhoomika");

        Collections.sort(collection);
        for(Object ref : collection)
            System.out.println(ref);
    }
}
