package mayinDeneme;

import java.util.Scanner;

public class MineSweeper {
    private int satir;
    private int sutun;
    private char[][] oyunTahtasi;
    private char[][] mayinlar;
    private boolean[][] ziyaretEdildi;
    private int mayinSayisi;


    public MineSweeper(int satir, int sutun) {
        this.satir = satir;
        this.sutun = sutun;
        oyunTahtasi = new char[satir][sutun];
        mayinlar = new char[satir][sutun];
        ziyaretEdildi = new boolean[satir][sutun];
        mayinSayisi = satir * sutun / 4; // Mayın sayısını istediğiniz şekilde ayarlayabilirsiniz
    }

    public void oyunuBaslat() {
        // Oyun tahtasını ve mayınları oluştur
        oyunTahtasiniOlustur();
        mayinlariYerlestir();

        // Oyunun ana döngüsü
        boolean devam = true;
        while (devam) {
            tahtayiGoster();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Satır ve sütun girin (örneğin: 1 2a): ");
            int satirSecim = scanner.nextInt() - 1;
            int sutunSecim = scanner.nextInt() - 1;

            if (ziyaretEdildi[satirSecim][sutunSecim]) {
                System.out.println("Bu hücre zaten seçildi.");
            } else if (mayinlar[satirSecim][sutunSecim] == '*') {
                System.out.println("Mayına bastınız! Oyun bitti!");
                devam = false;
            } else {
                int mayinSayisi = komsuMayinSayisiniBul(satirSecim, sutunSecim);
                oyunTahtasi[satirSecim][sutunSecim] = (char) (mayinSayisi + '0');
                ziyaretEdildi[satirSecim][sutunSecim] = true;
                if (kazandinMi()) {
                    System.out.println("Tebrikler! Oyunu kazandınız!");
                    devam = false;
                }
            }
        }
    }

    private void oyunTahtasiniOlustur() {
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                oyunTahtasi[i][j] = '-';
            }
        }
    }

    private void mayinlariYerlestir() {
        // Mayınları rastgele yerleştir
        for (int i = 0; i < mayinSayisi; i++) {
            int row, col;
            do {
                row = (int) (Math.random() * satir);
                col = (int) (Math.random() * sutun);
            } while (mayinlar[row][col] == '*');
            mayinlar[row][col] = '*';
        }
    }

    private int komsuMayinSayisiniBul(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < satir && j >= 0 && j < sutun && mayinlar[i][j] == '*') {
                    count++;
                }
            }
        }
        return count;
    }
    private void tahtayiGoster() {
        System.out.println("Oyun Tahtası:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(oyunTahtasi[i][j] + " ");
            }
            System.out.println();
        }
    }
    private boolean kazandinMi() {
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (!ziyaretEdildi[i][j] && mayinlar[i][j] != '*') {
                    return false;
                }
            }
        }
        return true;
    }






}

