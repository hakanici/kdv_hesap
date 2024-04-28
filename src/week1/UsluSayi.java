package week1;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        int n, k;
        int total = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Üssü Alınacak olan Sayıyı Giriniz : ");
        n = sc.nextInt();

        System.out.print("Üssü Giriniz : ");
        k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Cevap:" + total);


    }
}
