package com.xworkz.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRunner {
    public static void main(String[] args) {
        List collection = new LinkedList();
        collection.add(23);
        collection.add(78);
        collection.add(789);
        collection.add(1,890);
        System.out.println("LinkedList: "+collection);
        System.out.println("LinkedList: "+collection.toString());

        Object index = collection.get(1);//index
        System.out.println(index);

//        collection.remove(2); // unlink
//        System.out.println("LinkedList: "+collection);



    }
}
