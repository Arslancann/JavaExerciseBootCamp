package com.company;

public class İkiSayininYeriniDegistirme {

    public static void main(String[] args) {

        Double sayi1 = 1.2, sayi2 = 2.45;
        System.out.println("--Değişmeden Önce--");
        System.out.println("Birinci Sayı: " + sayi1);
        System.out.println("İkinci Sayı: " + sayi2);

        double bos = 0;
        bos = sayi1;
        sayi1 = sayi2;
        sayi2 = bos;
        System.out.println("--Değişimden Sonra--");
        System.out.println("Birinci Sayı: " + sayi1);
        System.out.println("İkinci Sayı: " + sayi2);

    }
}
