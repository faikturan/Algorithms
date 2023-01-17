package com.example.generic.sample03;

abstract public class Kisi {

    private String isim;
    private String tcKimlik;

    public String getIsim() {
        return isim;
    }

    public Kisi(String isim, String tcKimlik) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    abstract void kendiniTanit();

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                '}';
    }
}