package com.xworkz.generics.runner;

import com.xworkz.generics.comparator.MusicSingerComparator;
import com.xworkz.generics.comparator.MusicTitleComparator;
import com.xworkz.generics.customtype.MusicPlayer;

import java.util.Collections;
import java.util.LinkedList;

public class MusicRunner {
    public static void main(String[] args) {
        LinkedList<MusicPlayer> musicPlayers = new LinkedList<>();
        musicPlayers.add(new MusicPlayer("Mayavi","Sanjith Hegde",4.40f));
        musicPlayers.add(new MusicPlayer("Shauq","Amith Trivedi",4.16f));
        musicPlayers.add(new MusicPlayer("Eyes Closed","Ed Sheeran",3.14f));

        System.out.println("------------- Sort by duration by default sort method -------------");
        Collections.sort(musicPlayers);
        for (Object duration : musicPlayers)
            System.out.println(duration);

        System.out.println("\n------------- Sort by title by Comparator class -------------");
        Collections.sort(musicPlayers, new MusicTitleComparator());
        for(Object title: musicPlayers)
            System.out.println(title);

        System.out.println("\n------------- Sort by singer by Comparator class -------------");
        Collections.sort(musicPlayers, new MusicSingerComparator());
        for(Object singer: musicPlayers)
            System.out.println(singer);
    }
}
