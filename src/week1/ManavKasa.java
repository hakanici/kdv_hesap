package week1;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,tutar,armutkg,elmakg,domateskg,muzkg,patlicankg;
        Scanner inp=new Scanner(System.in);

        System.out.print("Kaç kilo Armut Aldığınızı Giriniz : ");
        armutkg= inp.nextDouble();

        System.out.print("Kaç kilo Elma Aldığınızı Giriniz : ");
        elmakg= inp.nextDouble();

        System.out.print("Kaç kilo Domates Aldığınızı Giriniz : ");
        domateskg= inp.nextDouble();

        System.out.print("Kaç kilo Muz Aldığınızı Giriniz : ");
        muzkg= inp.nextDouble();

        System.out.print("Kaç kilo Patlıcan Aldığınızı Giriniz : ");
        patlicankg= inp.nextDouble();

        tutar=(armutkg*armut)+(elmakg*elma)+(domateskg*domates)+(patlicankg*patlican);

        System.out.print("Toplam Tutar : "+tutar +" TL");







    }
}
