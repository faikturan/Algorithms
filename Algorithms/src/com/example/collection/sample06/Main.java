package com.example.collection.sample06;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> plakalar = new HashMap<>();
        plakalar.put(1,"Adana");
        plakalar.put(34,"İstanbul");
        plakalar.put(16,"Bursa");
        plakalar.put(35,"İzmir");
        plakalar.put(06,"Ankara");
        plakalar.put(null,"null deger");


        HashMap<Integer, String> plakalarYedek = new HashMap<>();
        System.out.println("plakalar yedek size: " +plakalarYedek.size());
        plakalarYedek.putAll(plakalar);
        System.out.println("plakalar yedek size: " +plakalarYedek.size());
        plakalarYedek.clear();
        System.out.println("clear sonrası size: " +plakalarYedek.size());


        System.out.println(plakalar);
        String deger = plakalar.get(06);
        System.out.println(deger);
        System.out.println(plakalar.size());
        System.out.println(plakalar.isEmpty());
        System.out.println(plakalar.containsKey(16));
        System.out.println(plakalar.containsValue("Hakkari"));
        System.out.println(plakalar.remove(35));
        System.out.println(plakalar.size());

        for (Integer key: plakalar.keySet()){
            System.out.println("Keyler : " +key);
        }

        for (String value: plakalar.values()){
            System.out.println(" " +value);
        }

        for (Map.Entry<Integer, String> entry : plakalar.entrySet()){
            System.out.println("key:"+entry.getKey()+ " value:" +entry.getValue());
        }
    }
}
