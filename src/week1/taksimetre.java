package week1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        double ucret,km,perKm=2.20,bas=10;
        Scanner inp=new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz : ");
        km=inp.nextDouble();

        ucret= (km*perKm)+bas;
        ucret=(ucret<20)? 20 : ucret;

        System.out.println("Ödenecek Toplam Tutar : "+ucret);






    }
}
