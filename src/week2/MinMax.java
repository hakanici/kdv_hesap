package week2;


import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[0];


        System.out.print("Sayı giriniz : ");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();

        for (int i : arr) {

            if (i < sayi) {
                min = i;
            }
            if (i > sayi) {
                max = i;
                break;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);

    }
}
