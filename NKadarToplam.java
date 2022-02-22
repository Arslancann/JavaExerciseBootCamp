package com.company;

import java.util.Scanner;

public class NKadarToplam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen n Değerini Giriniz: ");
        int n = sc.nextInt();
        int toplam = 0;

        for (int i = 0; i < n; i++) {
            toplam += i;
        }
        System.out.println("1 den " + n + " e Kadar Olan Sayıların Toplamı: " + toplam);

    }
}
