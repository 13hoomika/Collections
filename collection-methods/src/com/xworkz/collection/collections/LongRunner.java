package com.xworkz.collection.collections;

import java.util.ArrayList;
import java.util.Collection;

public class LongRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(3403456789L); // can give any datatype value -> converted to object type
        collection.add(987654327L);
        collection.add(3123456789L);
        System.out.println(collection);

        System.out.println("Relate one Collection to another");
        Collection collection1 = new ArrayList();
        collection1.add(10234567890L);
        collection1.add(204567894567L);

        collection1.addAll(collection);
        System.out.println(collection1);

        System.out.println(collection1.contains(204567894567L));
        System.out.println(collection1.containsAll(collection));//return boolean //takes Collection
        System.out.println(collection1.size());

        //retainAll
        System.out.println(collection1.retainAll(collection));
    }
}
