package week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {

        //Kullanıcı Adı : patika  Şifre: java123

        String userName, password, reset, newPw;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz : ");
        userName = sc.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = sc.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarılı bir Şekilde Giriş Yapıldı");
        } else {
            System.out.println("Girilen Bilgiler Hatalı. Şifrenizi değiştirmek ister misiniz? (evet/hayır)");
            reset = sc.nextLine();

            if (reset.equalsIgnoreCase("evet")) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newPw = sc.nextLine();

                if (newPw.equalsIgnoreCase("java123")) {
                    System.out.println("Yeni Şifreniz ile Eski Şifreniz Aynı Olamaz!");

                } else {
                    System.out.println("Şifreniz Değiştirildi");
                }
            }
            else if(reset.equalsIgnoreCase("hayır"))
            {
                System.out.println("Şifreniz Değiştirilmedi");
            }

            else {
                System.out.println("Geçersiz Girdi!");
            }


        }


    }
}
