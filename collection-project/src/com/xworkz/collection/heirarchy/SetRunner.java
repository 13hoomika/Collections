package com.xworkz.collection.heirarchy;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add(1);
        collection.add(2);
        collection.add(322);
        collection.add(6672);
        collection.add(2898);
        collection.add(23);

        System.out.println("HashSet: "+collection);

        Collection collection1 = new LinkedHashSet();
        collection1.add(1);
        collection1.add(2);
        collection1.add(322);
        collection1.add(6672);
        collection1.add(2898);
        collection1.add(23);

        System.out.println("LinkedHashSet: "+collection);

        Collection collection2 = new TreeSet();
        collection2.add(1);
        collection2.add(2);
        collection2.add(322);
        collection2.add(6672);
        collection2.add(2898);
        collection2.add(23);

        System.out.println("TreeSet: "+collection);
    }
}
