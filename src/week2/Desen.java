package week2;

import java.util.Scanner;

public class Desen {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int n = scanner.nextInt();
            scanner.close();

            printSeries(n);
        }

        public static void printSeries(int n) {
            if (n <= 0) {
                System.out.print(n + " ");
                return;
            }

            System.out.print(n + " ");
            printSeries(n - 5);
            System.out.print(n + " ");
        }
    }




