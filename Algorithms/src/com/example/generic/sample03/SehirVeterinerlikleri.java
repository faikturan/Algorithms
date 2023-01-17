package com.example.generic.sample03;

import java.util.ArrayList;

public class SehirVeterinerlikleri {

    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        this.sehirdekiVeterinerler = sehirdekiVeterinerler;
        toplamVeterinerSayisi=0;
    }

    public void sehireVeterinerEkle(Veteriner veteriner){
        sehirdekiVeterinerler.add(veteriner);
        toplamVeterinerSayisi++;
    }

    public void sehirdekiToplamVeterinerSayisiniBul(){
        System.out.println("Toplam veteriner sayısı: " + sehirdekiVeterinerler.size());
    }
}
