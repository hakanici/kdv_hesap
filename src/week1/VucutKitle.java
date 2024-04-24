package week1;
import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int kilo;
        double boy,indeks;

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo=inp.nextInt();

        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy=inp.nextDouble();

        indeks=kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : "+indeks);





    }
}
