package com.example.generic.sample01;

public class Main {
    public static void main(String[] args) {
        String[] isimler = {"emre", "ayşe", "ali"};
        Integer[] sayilar = {1, 5, 7, 9, 10};
        Character[] karakterler = {'a', 'b', 'k'};

        StringDiziYazdir.yazdir(isimler);
        IntegerDiziYazdir.yazdir(sayilar);
        CharDiziYazdir.yazdir(karakterler);

        GenericDiziYazdir<String> stringGnericDiziYazdir = new GenericDiziYazdir<>();
        stringGnericDiziYazdir.yazdir(isimler);

        GenericDiziYazdir<Integer> integerGnericDiziYazdir = new GenericDiziYazdir<>();
        integerGnericDiziYazdir.yazdir(sayilar);

        GenericDiziYazdir<Character> charGnericDiziYazdir = new GenericDiziYazdir<>();
        charGnericDiziYazdir.yazdir(karakterler);
    }
}
