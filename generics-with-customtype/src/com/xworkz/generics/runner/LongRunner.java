package com.xworkz.generics.runner;

import java.util.Collections;
import java.util.LinkedList;

public class LongRunner {
    public static void main(String[] args) {
        LinkedList<Long> ph = new LinkedList<>();
        ph.add(2234567890L);
        ph.add(2345678989L);
        ph.add(1223456780L);
        ph.add(23456780L);
        ph.add(7223456L);
        ph.add(4223456L);
        Collections.sort(ph);
        for (Object o : ph)
            System.out.println(o);
    }
}
