package week2;

import java.util.Arrays;
import java.util.Scanner;

public class Sirala {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(i + 1 + ". Elemanı: ");
            arr[i] = sc.nextInt();


        }
        Arrays.sort(arr);
        System.out.print("Sıralama : ");

        for (int dizi : arr) {

            System.out.print(dizi + " ");
        }

    }
}
