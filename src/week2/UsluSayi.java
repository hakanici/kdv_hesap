package week2;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tabanı Giriniz : ");
        int a = sc.nextInt();

        System.out.print("Üssü Giriniz : ");
        int b = sc.nextInt();

        System.out.println("Sonuç = " + us(a, b));


    }

    static int us(int a, int b) {

        if (b == 0)
            return 1;
        else
            return a * us(a, b - 1);

    }
}
