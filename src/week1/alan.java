package week1;
import java.util.Scanner;

public class alan {

    public static void main(String[] args) {


        double kenar1,kenar2,kenar3,cevre,alan,u,yaricevre;
        Scanner inp=new Scanner(System.in);

        System.out.print("1.Kenarı Giriniz : ");
        kenar1= inp.nextDouble();

        System.out.print("2.Kenarı Giriniz : ");
        kenar2= inp.nextDouble();

        System.out.print("3.Kenarı Giriniz : ");
        kenar3= inp.nextDouble();

        u=(kenar1+kenar2+kenar3)/2;
        cevre=2*u;
        yaricevre=(kenar1+kenar2+kenar3)/2;
        alan= Math.sqrt(yaricevre*(yaricevre-kenar1) * (yaricevre-kenar2) * (yaricevre-kenar3));

        System.out.println("Üçgenin Çevresi : "+cevre);
        System.out.println("Üçgenin Alanı : "+alan);

















    }
}

