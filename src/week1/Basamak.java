package week1;

import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        int toplam = 0;
        int kalan;

        while (sayi != 0) {
            kalan = sayi % 10;
            toplam += kalan;
            sayi /= 10;
        }

        System.out.println("Basamaklar toplamı: " + toplam);



    }
}
