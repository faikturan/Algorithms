package com.example.collection.sample06;

import java.util.HashMap;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>(16, 0.75f);
        map.put("emre", 1);
        map.put("fb", 2);
        map.put(null, 123456);
        map.put("Ea", 3);
        map.put("Ea", 5);

        System.out.println(map.get("Ea"));

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
