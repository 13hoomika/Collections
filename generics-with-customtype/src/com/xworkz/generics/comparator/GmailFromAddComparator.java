package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Gmail;

import java.util.Comparator;

public class GmailFromAddComparator implements Comparator<Gmail> {
    @Override
    public int compare(Gmail o1, Gmail o2) {
        return o1.getFromAddress().compareTo(o2.getFromAddress());
    }
}
