package week1;

import java.util.Scanner;

public class KucukBuyuk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int count = sc.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            System.out.print("Lütfen " + (i + 1) + ". sayıyı giriniz :");
            int num = sc.nextInt();

            if (num > maxNumber) {
                maxNumber = num;
            }
            if (num < minNumber) {
                minNumber = num;
            }

        }

        System.out.println("En Büyük Sayı : " + maxNumber + " " + "En Küçük Sayı : " + minNumber);
    }
}
