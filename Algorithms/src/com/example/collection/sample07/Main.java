package com.example.collection.sample07;

import com.sun.source.util.Trees;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> harfler = new HashSet<>();
        harfler.add("a");
        harfler.add("d");
        harfler.add("c");
        harfler.add("d");
        harfler.add("d");
        harfler.add("d");
        harfler.add("d");
        harfler.add("e");
        harfler.add("2");
        harfler.add("d");

        System.out.println(harfler);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("d");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("e");
        linkedHashSet.add("2");
        linkedHashSet.add("d");

        Object[] geciciDizi = linkedHashSet.toArray();
        System.out.println(geciciDizi[0].toString());

        System.out.println(linkedHashSet);


        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("1");
        treeSet.add("d");
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("d");
        treeSet.add("z");
        treeSet.add("d");
        treeSet.add("d");
        treeSet.add("e");
        treeSet.add("99");
        treeSet.add("2");
        treeSet.add("d");

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(treeSet);




    }
}
