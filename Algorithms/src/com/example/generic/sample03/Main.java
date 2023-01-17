package com.example.generic.sample03;

public class Main {

    public static void main(String[] args) {

        ilkNesneleriOlustur();
    }

    private static void ilkNesneleriOlustur(){
        Kedi kedi = new Kedi("01-01-2016", true, "Van Kedisi");
        Kedi kedi2 = new Kedi("01-04-2016", false, "Siyam");
        Kedi kedi3 = new Kedi("05-04-2016", true, "Tekir");


        Kopek kopek = new Kopek("02-06-2018", true, 1, "Golden");
        Kopek kopek2 = new Kopek("01-02-2017", true, 1, "Dalmaçyalı");
        Kopek kopek3 = new Kopek("06-10-2016", true, 4, "Pitbull");


        Musteri m1 = new Musteri("emre", "123", "ankara");
        m1.musteriyeHayvanEkle(kedi2);
        m1.musteriyeHayvanEkle(kopek3);

        Musteri m2 = new Musteri("hasan", "234", "izmir");
        Musteri m3 = new Musteri("ali", "3456", "istanbul");

        Veteriner v1 = new Veteriner("ayşe", "456", "ankara", 1);
        Veteriner v2 = new Veteriner("fatma", "567", "ege", 4);
        Veteriner v3 = new Veteriner("hayriye", "678", "marmara", 2);

    }
}