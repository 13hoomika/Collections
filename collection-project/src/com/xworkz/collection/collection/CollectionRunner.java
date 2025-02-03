package com.xworkz.collection.collection;

import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1); // can give any datatype value -> converted to object type
        collection.add(2);
        collection.add("Baba");
        collection.add(true);
        collection.add(299.00);
        System.out.println(collection);

        collection.remove(2);
        System.out.println(collection); // print result in single line

        collection.forEach(System.out::println); // print obj one by one => Good Practice

//        collection.removeAll(collection);
//        collection.clear();
//        System.out.println(collection);

        System.out.println("Relate one Collection to another");
        Collection collection1 = new ArrayList();
        collection1.add(23);
        collection1.add(26);
        // addAll() allow to add other collection data => help to relate one collection w/ other collection
        // similar to removeAll()
        collection1.addAll(collection);
        System.out.println(collection1);

        System.out.println(collection1.contains("Baba"));//return boolean - checks the value is present in collection
        System.out.println(collection1.containsAll(collection));//return boolean //takes Collection
        System.out.println(collection1.size());

        //retainAll
        System.out.println(collection1.retainAll(collection));

    }
}
