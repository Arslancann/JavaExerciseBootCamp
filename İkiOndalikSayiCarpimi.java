package com.company;

import java.util.Scanner;

public class İkiOndalikSayiCarpimi {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        double sayi1 = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("İkinci Sayıyı Giriniz: ");
        double sayi2 = sc2.nextDouble();

        double carpma = sayi1 * sayi2;
        System.out.println("Çarpım Sonucu: " + carpma);

    }
}
