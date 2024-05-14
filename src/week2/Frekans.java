package week2;

import java.util.Arrays;

public class Frekans {


        public static void main(String[] args) {
            int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};


            Arrays.sort(dizi);

            int n = dizi.length;
            int count = 1;


            for (int i = 1; i < n; i++) {
                if (dizi[i] == dizi[i - 1]) {
                    count++;
                } else {
                    System.out.println(dizi[i - 1] + " : " + count);
                    count = 1;
                }
            }

            System.out.println(dizi[n - 1] + " : " + count);
        }
    }

