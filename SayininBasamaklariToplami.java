package com.company;

import java.util.Scanner;

public class SayininBasamaklariToplami {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;

        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Girilen Sayının Basamak Toplamı:" + toplam);

    }
}
