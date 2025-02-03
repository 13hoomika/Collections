package com.xworkz.collection.customclass;
import java.util.ArrayList;
import java.util.Collection;

public class LudoRunner {
    public static void main(String[] args) {
        Ludo ludo=new Ludo(1, "Bhoomika", 45);
        Ludo ludo1=new Ludo(2, "Karan", 23);
        Ludo ludo2=new Ludo(3, "Vishwas", 27);
        Ludo ludo3=new Ludo(4, "Pradheep", 77);

        Collection collection=new ArrayList();

        collection.add(ludo);
        collection.add(ludo1);
        collection.add(ludo2);
        collection.add(ludo3);
        collection.add(new Ludo(5, "Gayathri", 26));

        Collection collection1= new ArrayList<>();
        Ludo ludo4=new Ludo(4, "Narayan", 37);
        collection1.add(new Ludo(1, "Chris", 31));
        collection1.add(new Ludo(2, "Kunal", 5));
        collection1.add(new Ludo(3, "Sham", 9));
        collection1.add(ludo4);

        collection1.addAll(collection);
        System.out.println("------------------- forEach method -------------------");
        collection.forEach(System.out::println);

        System.out.println("------------------- size method -------------------");
        int size=collection.size();
        System.out.println("collection size: "+size);

        int size1=collection1.size();
        System.out.println("collection1 size "+size1);

        System.out.println("------------------- remove method -------------------");
        boolean isPlayerRemoved=collection.remove(ludo2);
        System.out.println("Is the player 3 from collection removed: "+isPlayerRemoved);

        collection.forEach(System.out::println);
        System.out.println("after removing the collection size is "+collection.size());

        System.out.println("------------------- removeAll method -------------------");
        boolean isAllObjectsInCollectionRemoved=collection.removeAll(collection);
        System.out.println("isAllObjectsInCollectionRemoved: "+isAllObjectsInCollectionRemoved);
        collection.forEach(System.out::println);
        System.out.println("after removing all elements from collection the size is " + collection.size());

        System.out.println("------------------- retainAll method -------------------");
        boolean isCollectionRetained=collection.retainAll(collection1);
        System.out.println("Is the collection retained from collection1: "+ isCollectionRetained);
    }
}
