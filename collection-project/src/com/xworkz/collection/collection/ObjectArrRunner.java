package com.xworkz.collection.collection;

public class ObjectArrRunner {
    public static void main(String[] args) {
        Object[] obj1 = new ObjectArrRunner[2];
        obj1[0] = "Baba";
        obj1[1] = "babi";

        Object[] obj = new ObjectArrRunner[1];
        obj[0] = obj1;

        for (Object o: obj){
            //for (Object val : o) // can not retrieve Object[] data
                System.out.println((String) o); //even casting will give exceptions ArrayStoreException, ClassCastingException

        }




    }
}
