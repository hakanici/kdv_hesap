package week1;

import java.util.Scanner;

public class ArtikYil {

    /*Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.

100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yil;
        String durum = "";

        System.out.print("Yıl giriniz: ");
        yil = sc.nextInt();

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            durum = "Artık yıl";
        } else {
            durum = "Artık yıl değil";
        }

        System.out.println(durum);


    }
}
