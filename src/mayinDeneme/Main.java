package mayinDeneme;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int satir = scanner.nextInt();

        System.out.print("Sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        MineSweeper oyun = new MineSweeper(satir, sutun);
        oyun.oyunuBaslat();
    }
}
