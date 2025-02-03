package com.xworkz.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringRunner {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Adhi");
        collection.add("Poornima");
        collection.add("Neeraja");
        collection.add("Kavya");
        collection.add("Bhoomika");

        Collections.sort(collection); // String by default impl Comparable
        for(Object ref : collection)
            System.out.println(ref);
    }
}
