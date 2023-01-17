package com.example.collection.sample01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        ArrayList<String> isimler = new ArrayList<>(20);
        isimler.add("emre");
        isimler.add("hasan");
        isimler.add("ali");

        isimler.ensureCapacity(100);
        isimler.trimToSize();

        ArrayList<String> isimlerYedek = new ArrayList<>(isimler);
        System.out.println(isimlerYedek);
        System.out.println(isimlerYedek.size());
        System.out.println(isimlerYedek.isEmpty());

        //bütün listeyi temizler
        isimler.clear();
        System.out.println(isimlerYedek.isEmpty());

        isimler.add("emre");
        isimler.add("hasan");
        isimler.add("ali");

        System.out.println(isimler.contains("hasan"));
        System.out.println(isimler.contains("fatma"));

        String[] isimlerDizisi = isimler.toArray(new String[0]);
        System.out.println(isimlerDizisi[1]);

        System.out.println(isimler.get(0));

        isimler.set(0,"yeni emre");
        System.out.println(isimler.get(0));

        isimler.add(2, "hayriye");
        System.out.println(isimler);

        isimler.remove("hayriye");
        isimler.remove(2);
        System.out.println(isimler);
        isimler.add("kemal");
        isimler.add("mustafa");
        isimler.add("can");

        System.out.println(isimler);
        List<String> yeniIsimlerListesi = isimler.subList(1,3);
        System.out.println(yeniIsimlerListesi);

        ArrayList<String> erkekIsimleri = new ArrayList<>();
        erkekIsimleri.add("emre");
        erkekIsimleri.add("ali");
        ArrayList<String> kadinIsimleri = new ArrayList<>();
        kadinIsimleri.add("yeliz");
        kadinIsimleri.add("ceren");
        erkekIsimleri.addAll(kadinIsimleri);
        System.out.println(erkekIsimleri);
        erkekIsimleri.addAll(0, kadinIsimleri);
        System.out.println(erkekIsimleri);

        String[] sehirler = {"ankara", "busa", "izmir"};
        List<String> sehirListe;
        sehirListe = Arrays.asList(sehirler);
        System.out.println(sehirListe);

        ArrayList<String> sehirler2 = new ArrayList<>(Arrays.asList(sehirler));
        System.out.println(sehirler2);

        List<String> sehirler3=new ArrayList<>();
        Collections.addAll(sehirler3,sehirler);
        System.out.println(sehirler3);


    }
}
