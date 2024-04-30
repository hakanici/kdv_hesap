package week1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.print("Fibonacci dizisinin kaç elemanını görmek istersiniz?: ");
        int n = sc.nextInt();


        int a = 0, b = 1;

        System.out.println("Fibonacci dizisinin ilk " + n + " elemanı:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + "  ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
