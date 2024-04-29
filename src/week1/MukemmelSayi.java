package week1;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        /*
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total = total + i;
            }
        }
        if (n == total) {
            System.out.println(n + " Mükemmel Sayıdır");
        } else {
            System.out.println(n + " Mükemmel Sayı Değildir");
        }


    }
}
