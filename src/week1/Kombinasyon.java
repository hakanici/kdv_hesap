package week1;

import java.util.Scanner;

public class Kombinasyon {

    /*
    C(n,r) = n! / (r! * (n-r)!)
     */

    public static void main(String[] args) {

        int n, r, c;
        int fakt1 = 1, fakt2 = 1, fakt3 = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz : ");
        n = sc.nextInt();

        System.out.print("2.Sayıyı Giriniz : ");
        r = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fakt1 *= i;
        }
        for (int i = 1; i <= r; i++) {
            fakt2 *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            fakt3 *= i;
        }

        c = fakt1 / (fakt2 * (fakt3));

        System.out.println("C(" + n + "," + r + ")" + " = " + c);

    }
}
