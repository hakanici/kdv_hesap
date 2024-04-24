package week1;
import java.util.Scanner;


public class DaireDilimiAlani {
    public static void main(String[] args) {

        double pi=3.14,r,a,alan;

        Scanner inp=new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz : ");
        r= inp.nextDouble();

        System.out.print("Merkez Açı Ölçüsünü Giriniz : ");
        a= inp.nextDouble();

        alan= (pi* (r*r)*a)/360;

        System.out.println("Daire Diliminin ALanı : "+alan);











    }
}
