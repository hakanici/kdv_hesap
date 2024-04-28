package week1;

import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = sc.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e bölünebilen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("Girilen sayıya kadar 3 ve 4'e bölünebilen bir sayı yok.");
        }
    }
}
