package week1;

import java.util.Scanner;

public class Yildiz {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini giriniz (tek sayı olmalı): ");
        int yukseklik = sc.nextInt();

        if (yukseklik % 2 == 0) {
            System.out.println("Lütfen tek bir sayı girin.");
            return;
        }

        int yarimYukseklik = (yukseklik + 1) / 2;

        for (int i = 1; i <= yarimYukseklik; i++) {
            for (int j = 1; j <= yarimYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = yarimYukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yarimYukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();


        }



    }

}
