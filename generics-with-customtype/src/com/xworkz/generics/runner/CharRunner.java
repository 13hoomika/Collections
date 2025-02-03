package com.xworkz.generics.runner;

import java.util.Collections;
import java.util.LinkedList;

public class CharRunner {
    public static void main(String[] args) {
        LinkedList<Character> alphabets = new LinkedList<>();
        alphabets.add('A');
        alphabets.add('C');
        alphabets.add('D');
        alphabets.add('B');
        alphabets.add('F');
        alphabets.add('H');
        alphabets.add('E');
        alphabets.add('G');
        Collections.sort(alphabets);
        for(Object a : alphabets)
            System.out.println(a);
    }
}
