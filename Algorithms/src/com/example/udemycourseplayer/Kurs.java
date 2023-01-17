package com.example.udemycourseplayer;

import java.util.ArrayList;

public class Kurs {

    private String kursAdi;

    private ArrayList<Ders> kurstakiDersler;

    private ArrayList<Egitmen> kursEgitmenleri;

    //ders sayısı en az 5 ve toplam içerik en az 60 dakika olmalı
    private boolean yayinda;

    public Kurs(String kursAdi, ArrayList<Ders> kurstakiDersler, ArrayList<Egitmen> kursEgitmenleri, boolean yayinda) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kursEgitmenleri = new ArrayList<>();
        this.yayinda = false;
    }

    public void kursaEgitmenEkle(Egitmen yeniEgitmen){
        kursEgitmenleri.add(yeniEgitmen);
    }

    public void kursaEgitmenSil(Egitmen silinecekEgitmen){
        kursEgitmenleri.remove(silinecekEgitmen);
    }

    public void kursaDersEkle(Ders eklenecekDers){
        kurstakiDersler.add(eklenecekDers);
    }

    public int kurstakiDersSayisi(){
        return kurstakiDersler.size();
    }

    public int kurstakiToplamDerslerinDakikaSuresi(){
        double toplamSure = 0;
        for (Ders ders : kurstakiDersler){
            toplamSure = toplamSure + ders.getDakika();
        }
        return (int) toplamSure;
    }


}
