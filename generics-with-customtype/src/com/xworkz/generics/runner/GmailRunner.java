package com.xworkz.generics.runner;

import com.xworkz.generics.comparator.GmailBodyComparator;
import com.xworkz.generics.comparator.GmailFromAddComparator;
import com.xworkz.generics.comparator.GmailToAddComparator;
import com.xworkz.generics.customtype.Gmail;

import java.util.Collections;
import java.util.LinkedList;

public class GmailRunner {
    public static void main(String[] args) {
        LinkedList<Gmail> linkedList = new LinkedList<>();
        linkedList.add(new Gmail(1434,"keerthisr@gmail.com", "bhoomiakcp@gmail.com", "Happy birthday!!"));
        linkedList.add(new Gmail(3343,"bhoomikacp@gmail.com", "leetcode@gmail.com", "Join Your First Contest!"));
        linkedList.add(new Gmail(2342,"bcp@gmail.com", "googledev@gmail.com", "October developer update is here"));

        System.out.println("----------- Sort by Gmail id by default sort method -----------");
        Collections.sort(linkedList);
        for (Object obj : linkedList) {
            System.out.println(obj);
        }

        System.out.println("\n----------- Sort by Gmail body by Comparator class -----------");
        Collections.sort(linkedList,new GmailBodyComparator());
        for(Gmail body : linkedList)
            System.out.println(body);

        System.out.println("\n----------- Sort by Gmail FromAddress by Comparator class -----------");
        Collections.sort(linkedList,new GmailFromAddComparator());
        for(Gmail from : linkedList)
            System.out.println(from);

        System.out.println("\n----------- Sort by Gmail ToAddress by Comparator class -----------");
        Collections.sort(linkedList,new GmailToAddComparator());
        for(Gmail to : linkedList)
            System.out.println(to);

    }
}
