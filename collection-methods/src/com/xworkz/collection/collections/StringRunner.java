package com.xworkz.collection.collections;

import java.util.ArrayList;
import java.util.Collection;

public class StringRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("Dell"); // can give any datatype value -> converted to object type
        collection.add("Lenovo");
        collection.add("Asus");
        collection.add("HP");
        System.out.println(collection);

        collection.remove("HP");
//        collection.removeAll(collection);
//        collection.clear();
//        System.out.println(collection);

        System.out.println("Relate one Collection to another");
        Collection collection1 = new ArrayList();
        collection1.add("Acer");
        collection1.add("MSI");

        collection1.addAll(collection);
        System.out.println(collection1);

        System.out.println(collection1.contains("Dell"));//return boolean - checks the value is present in collection
        System.out.println(collection1.containsAll(collection));//return boolean //takes Collection
        System.out.println(collection1.size());

        //retainAll
        System.out.println(collection1.retainAll(collection));

    }
}
