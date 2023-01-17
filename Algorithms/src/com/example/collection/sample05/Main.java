package com.example.collection.sample05;

import java.io.ByteArrayInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Ogrenci> ogrenciKuyruk = new PriorityQueue<>(new Comparator<Ogrenci>() {
            @Override
            public int compare(Ogrenci o1, Ogrenci o2) {
                if (o1.id < o2.id)
                return -1;
                else return 1;
            }
        });
        ogrenciKuyruk.offer(new Ogrenci(1, 82));
        ogrenciKuyruk.offer(new Ogrenci(3, 70));
        ogrenciKuyruk.offer(new Ogrenci(2, 96));
        ogrenciKuyruk.offer(new Ogrenci(6, 12));
        ogrenciKuyruk.offer(new Ogrenci(5, 18));


        while (!ogrenciKuyruk.isEmpty()){
            System.out.println(ogrenciKuyruk.poll());
        }






        /*
        PriorityQueue<String> isimler  = new PriorityQueue<>();
        isimler.offer("can");
        isimler.offer("ayşe");
        isimler.offer("beyhan");
        isimler.offer("beril");
        isimler.offer("emre");
        isimler.offer("ali");

        while (!isimler.isEmpty()){
            System.out.println(isimler.poll());
        }
        System.out.println();

        Iterator<String> iterator = isimler.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //System.out.println(isimler);





        /*
        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.offer(1);
        sayilar.add(2);
        sayilar.offer(3);
        sayilar.offer(3);
        sayilar.offer(23);

        System.out.println(sayilar.peek());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        //System.out.println(sayilar.remove());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar.poll());
        System.out.println(sayilar);
         */
    }
}

class Ogrenci implements Comparable<Ogrenci>{

    int id;
    int notDegeri;

    public Ogrenci(int id, int notDegeri) {
        this.id = id;
        this.notDegeri = notDegeri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotDegeri() {
        return notDegeri;
    }

    public void setNotDegeri(int notDegeri) {
        this.notDegeri = notDegeri;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if (this.notDegeri > o.notDegeri){
            return -1;
        }else if(this.notDegeri < o.notDegeri){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", notDegeri=" + notDegeri +
                '}';
    }
}
