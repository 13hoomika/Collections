package com.xworkz.collection.heirarchy;

import java.util.*;

public class QueueRunner {
    public static void main(String[] args) {
        Collection collection = new PriorityQueue();
        collection.add(1);
        collection.add(2);
        collection.add(322);
        collection.add(6672);
        collection.add(2898);
        collection.add(23);

        System.out.println("PriorityQueue: "+collection);

        // not frequently LinkedList provides the same impl
        Collection collection1 = new ArrayDeque();
        collection1.add(1);
        collection1.add(2);
        collection1.add(322);
        collection1.add(6672);
        collection1.add(2898);
        collection1.add(23);

        System.out.println("ArrayDeque: "+collection);


    }
}
