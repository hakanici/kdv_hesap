package week1;

import java.util.Scanner;


/*Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
 */

public class ZodyakHesap {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int yil;
        String burc="";

        System.out.print("Doğum Yılınızı Giriniz : ");
        yil=sc.nextInt();

        if(yil>=12) {

            if (yil % 12 == 0) {
                burc = "Maymun";
            } else if (yil % 12 == 1) {
                burc = "Horoz";
            } else if (yil % 12 == 2) {
                burc = "Köpek";
            } else if (yil % 12 == 3) {
                burc = "Domuz";
            } else if (yil % 12 == 4) {
                burc = "Fare";
            } else if (yil % 12 == 5) {
                burc = "Öküz";
            } else if (yil % 12 == 6) {
                burc = "Kaplan";
            } else if (yil % 12 == 7) {
                burc = "Tavşan";
            } else if (yil % 12 == 8) {
                burc = "Ejderha";
            } else if (yil % 12 == 9) {
                burc = "Yılan";
            } else if (yil % 12 == 10) {
                burc = "At";
            } else {
                burc = "Koyun";
            }

            System.out.println(("Çin Zodyağı Burcunuz : ") + burc);
        }

        else{
            System.out.println("Lütfen Geçerli bir Tarih Giriniz!");
        }





    }
}
