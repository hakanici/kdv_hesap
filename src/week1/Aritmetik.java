package week1;
import java.util.Scanner;

public class Aritmetik {
    public static void main(String[] args) {

        //a+b*c-b

        int a,b,c,sonuc;
        Scanner sc=new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz : ");
        a= sc.nextInt();

        System.out.print("2.Sayıyı Giriniz : ");
        b= sc.nextInt();

        System.out.print("3.Sayıyı Giriniz : ");
        c= sc.nextInt();

        sonuc=(a+b)*c-b;

        System.out.print("İşleminizin Sonucu : "+sonuc);

    }
}
