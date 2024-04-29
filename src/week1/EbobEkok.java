package week1;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a,b;
        int i=1;
        int ebob=1;
        int ekok;

        System.out.print("İlk Sayıyı Giriniz : ");
        a=sc.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        b=sc.nextInt();

        if(a<b) {

            while (i <= a) {
                i++;
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }
        }

        else {
            while (i <= b) {
                i++;
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                }
            }


        }
        ekok=(a*b)/ebob;
        System.out.println("EBOB : "+ebob+"\nEKOK : "+ekok);
    }
}
