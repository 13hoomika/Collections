package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Application;

import java.util.Comparator;

public class AppNameComparator implements Comparator <Application> {

    @Override
    public int compare(Application o1, Application o2) {
        return o1.getAppName().compareTo(o2.getAppName());
    }
}
