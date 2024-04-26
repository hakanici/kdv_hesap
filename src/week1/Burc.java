package week1;

import java.util.Scanner;

public class Burc {

/*Koç Burcu : 21 Mart - 20 Nisan
 Boğa Burcu : 21 Nisan - 21 Mayıs
 İkizler Burcu : 22 Mayıs - 22 Haziran
 Yengeç Burcu : 23 Haziran - 22 Temmuz
 Aslan Burcu : 23 Temmuz - 22 Ağustos
 Başak Burcu : 23 Ağustos - 22 Eylül
 Terazi Burcu : 23 Eylül - 22 Ekim
 Akrep Burcu : 23 Ekim - 21 Kasım
 Yay Burcu : 22 Kasım - 21 Aralık
 Oğlak Burcu : 22 Aralık - 21 Ocak
 Kova Burcu : 22 Ocak - 19 Şubat
 Balık Burcu : 20 Şubat - 20 Mart
*/

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int day,month;
        String burc="";
        boolean isError=false;

        System.out.print("Doğdunuz Günü Giriniz : ");
        day=sc.nextInt();

        System.out.print("Doğduğunuz Ayı Giriniz : ");
        month=sc.nextInt();



            if ((month == 1) && (day >= 22) && (day<32)) {
                burc = "Kova";



            } else if (month == 1 && day<32) {
                burc = "Oğlak";




            } else if (month == 2 && day <= 19) {
                burc = "Kova";


            } else if (month == 2 && day<30) {
                burc = "Balık";


            } else if (month == 3 && day <= 20) {
                burc = "Balık";


            } else if (month == 3 && day<30) {
                burc = "Koç";


            } else if (month == 4 && day <= 20) {
                burc = "Koç";


            } else if (month == 4 && day<31) {
                burc = "Boğa";


            } else if (month == 5 && day >= 22) {
                burc = "İkizler";


            } else if (month == 5) {
                burc = "Boğa";


            } else if (month == 6 && day <= 22) {
                burc = "İkizler";


            } else if (month == 6 && day<31) {
                burc = "Yengeç";


            } else if (month == 7 && day <= 22) {
                burc = "Yengeç";


            } else if (month == 7 && day<32) {
                burc = "Aslan";


            } else if (month == 8 && day <= 22) {
                burc = "Aslan";


            } else if (month == 8 && day<32) {
                burc = "Başak";


            } else if (month == 9 && day <= 22) {
                burc = "Başak";


            } else if (month == 9 && day<31) {
                burc = "Terazi";


            } else if (month == 10 && day <= 22) {
                burc = "Terazi";


            } else if (month == 10 && day<32) {
                burc = "Akrep";


            } else if (month == 11 && day <= 21) {
                burc = "Akrep";


            } else if (month == 11 && day<31) {
                burc = "Yay";


            } else if (month == 12 && day <= 21) {
                burc = "Yay";


            } else if (month == 12 && day<32) {
                burc = "Oğlak";



            }

            else {
                isError=true;
            }

            if(isError)
            {
                System.out.println("Lütfen Geçerli Gün ve Ay Değeri Giriniz");
            }

            else {
                System.out.println("Burcunuz :" +burc);
            }
















    }
}
