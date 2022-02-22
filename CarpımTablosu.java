package com.company;

import java.util.Scanner;

public class CarpımTablosu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayi = sc.nextInt();
        int carpim = 0;

        for (int i = 1; i <= 10; i++) {
            carpim = sayi * i;
            System.out.println(sayi + " * " + i + " = " + carpim);
            
        }
    }
}
