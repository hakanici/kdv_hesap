package week1;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int n=sc.nextInt();
        double result=0;
        for (double i=1; i<=n; i++)
        {
            result+=(1/i);
        }
        System.out.println("Sonuç:" +result);

    }
}
