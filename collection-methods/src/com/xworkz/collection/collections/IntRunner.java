package com.xworkz.collection.collections;

import java.util.ArrayList;
import java.util.Collection;

public class IntRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1); // can give any datatype value -> converted to object type
        collection.add(2);
        collection.add(3);
        collection.add(4);
        System.out.println(collection);

        System.out.println("Relate one Collection to another");
        Collection collection1 = new ArrayList();
        collection1.add(10);
        collection1.add(20);

        collection1.addAll(collection);
        System.out.println(collection1);

        collection.remove(4);
        System.out.println("4 is deleted from collection object"+ collection);

        System.out.println("is collection1 contains 10:"+collection1.contains(10));
        System.out.println("is collection1 contains collection:"+collection1.containsAll(collection));//return boolean //takes Collection
        System.out.println("collection1 size:"+collection1.size());

        //retainAll
        System.out.println(collection1.retainAll(collection));

    }
}
