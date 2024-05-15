package week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        int right = 5;
        int selected;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[right];
        System.out.println(number);

        while (right > 0) {

            System.out.print("Tahmininizi Giriniz : ");
            selected = sc.nextInt();

            if (selected > 99 || selected < 1) {
                System.out.println("0-100 arasında bir değer giriniz!");
                continue;
            }

            if (selected < number) {
                right--;
                System.out.println("Sayınız gizli sayıdan küçük! Kalan hakkınız :" + right);
                arr[i] = selected;
                i++;

            } else if (selected > number) {
                right--;
                System.out.println("Sayınız gizli sayıdan büyük! Kalan hakkınız :" + right);
                arr[i] = selected;
                i++;

            } else {
                System.out.println("Tebrikler doğru bildiniz!");
                break;
            }
            if (right == 0) {
                System.out.println("Kaybettiniz!");
                System.out.print("Denediğiniz Sayılar : " + Arrays.toString(arr));
            }

        }


    }
}
