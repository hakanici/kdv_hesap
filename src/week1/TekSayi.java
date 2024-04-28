package week1;

import java.util.Scanner;

public class TekSayi {

    public static void main(String[] args) {

        int n;
        int toplam = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz : ");
            n = sc.nextInt();

            if (n % 2 == 0 && n % 4 == 0) {
                toplam += n;
            }

        }


        while (n % 2 == 0);

        System.out.println("Girilen Sayılardan 2 ve 4'ün katı olan sayıların toplamı : " + toplam);

    }
}
