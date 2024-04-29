package week1;

import java.util.Scanner;

public class TersYildiz {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = sc.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <= basamakSayisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
