package com.xworkz.collection.list;

import java.util.*;

public class VectorRunner {
    public static void main(String[] args) {
        Collection collection = new Vector(10); // setting initial capacity
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);
        collection.add(9);
        collection.add(10);
        collection.add(11);

        collection.add(12);
        collection.add(13);

        System.out.println("ArrayList: "+collection);// will not give ArrayIndexOutOfBoundsException as ArrayList is a growable array

    }
}
