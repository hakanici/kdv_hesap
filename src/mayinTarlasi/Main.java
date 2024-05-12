package mayinTarlasi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = 0;
        int col = 0;

        do {

            System.out.print("Satırı giriniz : ");
            row = sc.nextInt();
            System.out.print("Sütunu giriniz : ");
            col = sc.nextInt();
            System.out.println();
            if (row < 2 || col < 2) {
                System.out.println("Satır ve Sütun sayısı minimum 2 olmalıdır !");
            }


        }
        while (row < 2 || col < 2); // 2'den küçük rakam girilmemesinin kontrolünü yapar.


        MineSweeper game = new MineSweeper(row, col); //yeni nesne oluşturuldu.
        game.startGame();


    }
}




