package week1;

import java.util.Scanner;

public class UcakBileti {


    /*

Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.


     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        int yas = sc.nextInt();

        System.out.print("Mesafeyi Giriniz (km) : ");
        int km = sc.nextInt();

        System.out.print("Yolculuk Tipinizi Seçiniz (1:gidiş / 2:gidiş-dönüş) : ");
        int tip = sc.nextInt();

        double price = 0.10 * km;
        double discount;


        if (yas > 0 && km > 0) {
            switch (tip) {
                case 1:
                    if (yas < 12) {
                        price = price - (price * 0.5);
                        discount = price * 0.5;
                    } else if (yas >= 12 && yas <= 24) {
                        price = price - (price * 0.10);
                        discount = price * 0.1;
                    } else if (yas > 65) {
                        price = price - (price * 0.30);
                        discount = price * 0.3;
                    }
                    System.out.println("Ödenecek Tutar : " +price+ " TL");
                    break;
                case 2:
                    if (yas < 12) {
                        price = price - (price * 0.5);

                        price=price*1.6;
                    } else if (yas >= 12 && yas <= 24)
                    {

                        price = price - (price * 0.10);

                        price=price*1.6;
                    } else if (yas > 65) {
                        price = price - (price * 0.30);

                        price=price*1.6;
                    }
                    System.out.println("Ödenecek Tutar : " +price+ " TL");
                    break;

                default:
                    System.out.println("Geçersiz Girdi");


            }

        }
        else {
            System.out.println("Geçersiz yaş veya Mesafe Girdiniz!");
        }


    }
}
