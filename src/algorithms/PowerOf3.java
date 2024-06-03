package algorithms;

import java.util.Scanner;

public class PowerOf3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number2 = sc.nextInt();
        number(number2);

    }


    public static void number(int n) {
        for (int i = 3; i <= 100; i*=3) {
            int a=3;
            a*=i;
            System.out.println(a);

        }
    }
}
