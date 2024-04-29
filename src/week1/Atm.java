package week1;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        String id, pw;
        int right = 3;
        int choose;
        int balance = 1500;

        Scanner sc = new Scanner(System.in);


        while (right > 0) {
            System.out.print("Kullanıcı Adını Giriniz : ");
            id = sc.nextLine();

            System.out.print("Şifrenizi Giriniz : ");
            pw = sc.nextLine();

            if (id.equalsIgnoreCase("patika") && (pw.equalsIgnoreCase("java123"))) {

                System.out.println("Patika Bankasına Hoş Geldiniz");

                do {
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : (1-4)\n");
                    System.out.println((" 1-Para Yatır\n 2-Para Çek\n 3-Bakiye Sorgula\n 4-Çıkış Yap"));
                    choose = sc.nextInt();

                    switch (choose) {

                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = sc.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            price = sc.nextInt();
                            if (balance > price) {
                                balance -= price;
                            } else {
                                System.out.println("Bakiye Yetersiz!");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            break;


                    }

                }
                while (choose != 4);

                System.out.println("Tekrar Görüşmek Üzere");
                break;

            } else {
                right--;
                System.out.println("Kullanıcı Adı veya Şifre Hatalı!\nKalan Hakkınız : " + right);
                if (right == 0) {
                    System.out.println("Hesabınız Bloke olmuştur. Lütfen Bankanızla İletişime Geçin.");
                }

            }

        }
    }
}
