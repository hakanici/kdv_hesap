package week1;

import java.util.Scanner;

public class Kuvvet {

    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        n=sc.nextInt();

        System.out.println("\n"+"4'ün kuvvetleri ");

        for (int i=1; i<=n; i*=4)
        {
            System.out.println(i);

        }
        System.out.println("\n"+"5'in kuvvetleri ");
        for(int k=1; k<=n; k*=5)
        {
            System.out.println(k);
        }
    }
}
