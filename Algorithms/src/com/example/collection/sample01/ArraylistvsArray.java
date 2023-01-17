package com.example.collection.sample01;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistvsArray {
    public static void main(String[] args) {
        ArrayList<String> isimlerListesi = new ArrayList<>();
        String[] isimlerDizisi = new String[1000000];

        long baslamaZamani = System.currentTimeMillis();
        //dizi elemanları atanır
        for(int i = 0; i <1000000; i++){
            isimlerDizisi[i] = "deneme" +i;
        }
        long bitmeZamani = System.currentTimeMillis();

        System.out.println("Dizi çalışma süresi:  " + (bitmeZamani - baslamaZamani));

        baslamaZamani = System.currentTimeMillis();
        for(int i = 0; i <1000000; i++){
            isimlerListesi.add("deneme" +i);
        }
        bitmeZamani = System.currentTimeMillis();

        System.out.println("Listenin çalışma süresi:  " + (bitmeZamani - baslamaZamani));

    }
}
