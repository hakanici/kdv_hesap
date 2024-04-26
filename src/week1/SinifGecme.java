package week1;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

    //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Scanner scanner=new Scanner(System.in);

        System.out.print("Matematik notunu girin : ");
        int matematikNotu = scanner.nextInt();
        int matematikNotuSayac = 1;


        System.out.print("Fizik notunu girin : ");
        int fizikNotu = scanner.nextInt();
        int fizikNotuSayac = 1;


        System.out.print("Türkçe notunu girin : ");
        int turkceNotu = scanner.nextInt();
        int turkceNotuSayac = 1;


        System.out.print("Kimya notunu girin : ");
        int kimyaNotu = scanner.nextInt();
        int kimyaNotuSayac = 1;


        System.out.print("Müzik notunu girin : ");
        int muzikNotu = scanner.nextInt();
        int muzikNotuSayac = 1;


        int toplamNot = 0;
        int toplamNotSayac = 0;


        if (matematikNotu >= 0 && matematikNotu <= 100) {
            toplamNot += matematikNotu;
            toplamNotSayac++;
            matematikNotuSayac = 0;
        }


        if (fizikNotu >= 0 && fizikNotu <= 100) {
            toplamNot += fizikNotu;
            toplamNotSayac++;
            fizikNotuSayac = 0;
        }


        if (turkceNotu >= 0 && turkceNotu <= 100) {
            toplamNot += turkceNotu;
            toplamNotSayac++;
            turkceNotuSayac = 0;
        }


        if (kimyaNotu >= 0 && kimyaNotu <= 100) {
            toplamNot += kimyaNotu;
            toplamNotSayac++;
            kimyaNotuSayac = 0;
        }


        if (muzikNotu >= 0 && muzikNotu <= 100) {
            toplamNot += muzikNotu;
            toplamNotSayac++;
            muzikNotuSayac = 0;
        }


        if (toplamNotSayac > 0) {
            double ortalama = (double) toplamNot / toplamNotSayac;
            System.out.println("Not Ortalaması: " + ortalama);
        } else {
            System.out.println("Girilen notlar arasında 0-100 aralığında not yok.");
        }


        int girilmeyenNotSayisi = matematikNotuSayac + fizikNotuSayac + turkceNotuSayac + kimyaNotuSayac + muzikNotuSayac;
        System.out.println("0-100 arası girilmeyen not sayısı: " + girilmeyenNotSayisi);

    }
}
