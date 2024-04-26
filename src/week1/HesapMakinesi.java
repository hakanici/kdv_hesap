package week1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {


        int n1,n2,select;
        Scanner sc=new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        n1=sc.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2=sc.nextInt();

        System.out.println("\nYapmak İstediğiniz İşlemi Seçiniz:\n \n1:Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölme");
        select=sc.nextInt();

        switch (select){
            case 1:
                System.out.println("İşleminizin Sonucu : "+(n1+n2));
                break;

            case 2:
                System.out.println("İşleminizin Sonucu : "+(n1-n2));
                break;

            case 3:
                System.out.println("İşleminizin Sonucu : "+(n1*n2));
                break;

            case 4:
                if (n2==0)
                {
                    System.out.println("Geçersiz Bölme İşlemi!");
                }
                else {
                    System.out.println("İşleminizin Sonucu : " + (n1 / n2));

                }
                break;

            default:
                System.out.println("Geçersiz Girdi!");

        }










    }
}
