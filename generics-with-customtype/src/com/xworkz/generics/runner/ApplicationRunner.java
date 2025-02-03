package com.xworkz.generics.runner;

import com.xworkz.generics.comparator.AppNameComparator;
import com.xworkz.generics.comparator.AppVersioComparator;
import com.xworkz.generics.comparator.AppDeveloperComparator;
import com.xworkz.generics.customtype.Application;

import java.util.Collections;
import java.util.LinkedList;

public class ApplicationRunner {
    public static void main(String[] args) {
        LinkedList<Application> apps = new LinkedList<>();
        apps.add(new Application(3,"Threads",2.3,"Meta"));
        apps.add(new Application(1,"Vyom",8.5,"Union Bank of India"));
        apps.add(new Application(2,"Namma Metro",2.13,"BMRCL"));
        apps.add(new Application(4,"BMTC",8.13,"BMTC"));

        System.out.println("----------- Sort by Application id by default sort method -----------");
        Collections.sort(apps);
        for (Object obj : apps)
            System.out.println(obj);


        System.out.println("\n----------- Sort by Application appName by Comparator class -----------");
        Collections.sort(apps,new AppNameComparator());
        for (Object appName : apps)
            System.out.println(appName);

        System.out.println("\n----------- Sort by Application version by Comparator class -----------");
        Collections.sort(apps,new AppVersioComparator());
        for (Object version : apps)
            System.out.println(version);

        System.out.println("\n----------- Sort by Application developer by Comparator class -----------");
        Collections.sort(apps, new AppDeveloperComparator());
        for (Object developer : apps)
            System.out.println(developer);


    }
}
