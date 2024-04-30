package week1;

import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Bir Tam Sayı Giriniz : ");
        int n1=sc.nextInt();

        System.out.print("Bir Ondalıklı Sayı Giriniz : ");
        double n2=sc.nextDouble();


        double sayi2= (double) n1;
        int sayi1=(int) n2;





        System.out.println(sayi2+" - "+sayi1);
    }
}
