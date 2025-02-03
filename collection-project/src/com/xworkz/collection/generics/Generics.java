package com.xworkz.collection.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //generics <> in collection framework to store homogeneous type of data, used only when u know waht type of data ur r going to add
        // angular bracket <> can have only Primitive/wrapper data type
        List<Integer> collection = new LinkedList<>();
        collection.add(43);
        collection.add(76);
        collection.add(44);

        System.out.println("fetch all data");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);

            
        }
    }
}
