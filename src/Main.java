import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double fiyat,kdv1,kdv2,toplamTutar;

        Scanner inp=new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz : ");
        fiyat=inp.nextDouble();

        kdv1= 0.18;
        kdv2= 0.08;

        if (fiyat>0 && fiyat<=1000)
        {
            toplamTutar= fiyat +(fiyat * kdv1);
            System.out.println("KDV Oranı : "+kdv1);
            System.out.print("KDV'li Fiyat : "+toplamTutar);
        }
        else if(fiyat>1000)
        {
            toplamTutar= fiyat +(fiyat * kdv2);
            System.out.println("KDV Oranı : "+kdv2);
            System.out.print("KDV'li Fiyat : "+toplamTutar);
        }
        else
        {
            System.out.print("Lütfen Geçerli bir Fiyat Giriniz");
        }








        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}