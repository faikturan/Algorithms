package com.example.collection.sample03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> sayilar = new LinkedList<>();
        ArrayList<Integer> sayilar2 = new ArrayList<>();

        linkelistiHazirla(sayilar);
        System.out.println(sayilar);

        arraylistiHazirla(sayilar2);
        System.out.println(sayilar2);


       /* sayilar.add(1);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(2,3);
        sayilar.set(1,10);
        System.out.println(sayilar);
        System.out.println(sayilar.get(1));

        ListIterator<Integer> iterator = sayilar.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/

    }

    private static void arraylistiHazirla(ArrayList<Integer> sayilar2) {
        for (int i=0; i < 9; i++){
            int yeniEklenecekEleman = (int) (Math.random()*5);
            siraliEkle(sayilar2, yeniEklenecekEleman);
        }
    }

    private static void linkelistiHazirla(LinkedList<Integer> sayilar) {
        for (int i=0; i < 9; i++){
            int yeniEklenecekEleman = (int) (Math.random()*5);
            siraliEkle(sayilar, yeniEklenecekEleman);
        }

    }

    public static boolean siraliEkle(List<Integer> liste, int yeniEklenecekEleman){
        ListIterator<Integer> iterator = liste.listIterator();

        while (iterator.hasNext()){
            int karsilastirmaSonucu = iterator.next().compareTo(yeniEklenecekEleman);
            if (karsilastirmaSonucu == 0){
                iterator.add(yeniEklenecekEleman);
                return true;
            }else if(karsilastirmaSonucu > 0){
                iterator.previous();
                iterator.add(yeniEklenecekEleman);
                return true;
            }else{

            }
        }
        iterator.add(yeniEklenecekEleman);
        return true;
    }
}
