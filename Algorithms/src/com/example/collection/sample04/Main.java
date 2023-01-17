package com.example.collection.sample04;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> sehirler = new Vector<>(2, 10);

        System.out.println(sehirler.capacity());
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        System.out.println(sehirler.capacity());
        sehirler.setSize(20);
        System.out.println(sehirler.capacity());
        System.out.println(sehirler);

        System.out.println(sehirler.firstElement());
        System.out.println(sehirler.lastElement());


        for(int i=0; i < sehirler.size(); i++){
            System.out.print(sehirler.get(i) + ",");
        }

        System.out.println("\nIterator ile gezinti");
        Iterator<String> iterator = sehirler.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }

        System.out.println("\nEnumeration ile gezinti");
        Enumeration<String> enumeration = sehirler.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement()+",");
        }
    }
}
