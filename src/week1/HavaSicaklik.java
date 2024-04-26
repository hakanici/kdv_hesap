package week1;

import java.util.Scanner;

public class HavaSicaklik {

    public static void main(String[] args) {


/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
  Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
  Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
  Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/
        Scanner sc=new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklığı Giriniz : ");
        heat=sc.nextInt();

        if (heat<5)
        {
            System.out.println("Kayağa gidebilirsin");
        }

        else if (heat<=25)
        {
            System.out.println("Sinemaya gidebilirsin");
        }

        if(heat>=15 && heat<=25)
        {
            System.out.println("Pikniğe gidebilirsin");
        }

        else if(heat>25) {
            System.out.println("Yüzmeye gidebilirsin");
        }




    }
}
