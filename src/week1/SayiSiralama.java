package week1;

import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a,b,c;

        System.out.print("1.Sayıyı Giriniz : ");
        a=sc.nextInt();

        System.out.print("2.Sayıyı Giriniz : ");
        b=sc.nextInt();

        System.out.print("3.Sayıyı Giriniz : ");
        c=sc.nextInt();

        if((a<b) && (a<c))
        {
            if(b<c)
            {
                System.out.println("a<b<c");
            }
            else{
                System.out.println("a<c<b");
            }
        }

        if((b<a) && (b<c))
        {
            if(a<c)
            {
                System.out.println("b<a<c");
            }
            else{
                System.out.println("b<c<a");
            }
        }

        if((c<b) && (c<a))
        {
            if(b<a)
            {
                System.out.println("c<b<a");
            }
            else{
                System.out.println("c<a<b");
            }
        }

    }
}
