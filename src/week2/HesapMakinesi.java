package week2;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n";

        System.out.println(menu);

        while (true) {
            System.out.print("Bir İşlem Seçiniz 1-8) : ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.print("1.Sayıyı Giriniz : ");
                    int n1 = sc.nextInt();
                    System.out.print("2.Sayıyı Giriniz : ");
                    int n2 = sc.nextInt();
                    System.out.println("Toplam Sonucu = " + toplama(n1, n2));
                    break;
                case 2:
                    System.out.print("1.Sayıyı Giriniz : ");
                    int n3 = sc.nextInt();
                    System.out.print("2.Sayıyı Giriniz : ");
                    int n4 = sc.nextInt();
                    System.out.println("Çıkarma Sonucu = " + cikarma(n3, n4));
                    break;
                case 3:
                    System.out.print("1.Sayıyı Giriniz : ");
                    int n5 = sc.nextInt();
                    System.out.print("2.Sayıyı Giriniz : ");
                    int n6 = sc.nextInt();
                    System.out.println("Çarpım Sonucu = " + carpma(n5, n6));
                    break;
                case 4:
                    System.out.print("1.Sayıyı Giriniz : ");
                    int n7 = sc.nextInt();
                    System.out.print("2.Sayıyı Giriniz : ");
                    int n8 = sc.nextInt();
                    if(n8==0)
                    {
                        System.out.println("Geçersiz Bölme İşlemi!");
                    }
                    else
                        System.out.println("Bölüm Sonucu = " + bolme(n7, n8));
                    break;
                case 5:
                    System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
                    int n9 = sc.nextInt();
                    System.out.print("Üssü Giriniz : ");
                    int n10 = sc.nextInt();
                    System.out.println("Sonuç = " + us(n9, n10));
                    break;
                case 6:
                    System.out.print("Bir Sayı Giriniz : ");
                    int n11 = sc.nextInt();
                    System.out.println(n11+"! = " + fakt(n11));
                    break;
                case 7:
                    System.out.println("1.Sayıyı Giriniz : ");
                    int n12= sc.nextInt();
                    System.out.println("2.Sayıyı Giriniz : ");
                    int n13= sc.nextInt();
                    System.out.println(n12+" % "+n13+ " = " + mod(n12, n13));
                    break;
                case 8:
                    System.out.println("1.Kenarı Giriniz : ");
                    int n14= sc.nextInt();
                    System.out.println("2.Kenarı Giriniz : ");
                    int n15= sc.nextInt();
                    System.out.println("Dikdörtgenin Çevresi = " + diktortgenCevre(n14, n15));
                    System.out.println("Dikdörtgenin Alanı = " + diktortgenAlan(n14, n15));
                    break;
                case 0:
                    System.out.println("Çıkış Yapıldı");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lütfen Geçerli bir İşlem Seçiniz");


            }
        }

    }

    static int toplama(int a, int b) {


        return a + b;
    }

    static int cikarma(int a, int b) {


        return a - b;
    }

    static int carpma(int a, int b) {


        return a * b;
    }

    static int bolme(int a, int b) {


        return a / b;
    }

    static int us(int a, int b) {
        int result = 1;


        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int fakt(int a) {

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
    static int mod(int a,int b) {

        return a%b;
    }
    static int diktortgenCevre(int a,int b) {

        int cevre=2*(a+b);
        return cevre;


    }
    static int diktortgenAlan(int a,int b) {

        int alan=a*b;
        return alan;


    }


}
