package com.example.collection.sample07;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("1",1);
        treeMap.put("2",2);
        treeMap.put("3",3);
        treeMap.put("4",4);

        //SortedSet ve SortedMap metotları
        System.out.println(treeMap.comparator());
        System.out.println(treeSet.comparator());
        TreeSet<String> yedekSet= (TreeSet<String>) treeSet.subSet("2", "4");
        System.out.println(yedekSet);
        System.out.println(treeMap.subMap("2","4"));

        System.out.println(treeSet.headSet("5"));
        System.out.println(treeMap.headMap("3"));

        System.out.println(treeSet.tailSet("5"));
        System.out.println(treeMap.tailMap("3"));

        System.out.println(treeMap.firstKey());
        System.out.println(treeSet.first());

        System.out.println(treeMap.lastKey());
        System.out.println(treeSet.last());

        //NavigableSet ve navigablemap metotları

        System.out.println("Lower" + treeSet.lower("3"));
        System.out.println("Lower" + treeMap.lowerKey("3"));

        //verilen key değerine eşit veya ondan bir küçük olan değeri verir
        System.out.println("Floor: " + treeSet.floor("3"));
        System.out.println("Floor: " + treeMap.floorKey("3"));

        //verilen key değerine eşit veya ondan bir büyük olan değeri verir
        System.out.println("ceiling: " + treeSet.ceiling("3"));
        System.out.println("ceiling: " + treeMap.ceilingKey("3"));


        System.out.println("higher: " + treeSet.higher("2"));
        System.out.println("higher: " + treeMap.higherKey("2"));

        //ilk elemanı verir ve sonra yapıdan siler
        //System.out.println("poll first:" +treeSet.pollFirst());
        System.out.println(treeSet);

        //son elemanı verir ve sonra yapıdan siler
        //System.out.println("poll first:" +treeSet.pollLast());
        System.out.println(treeSet);

        Iterator<String> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
