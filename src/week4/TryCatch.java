package week4;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Index giriniz : ");
        int selectIndex = sc.nextInt();
        catchError(selectIndex, arr);


    }

    public static void catchError(int i, int[] arr) {

        try {

            System.out.println(arr[i]);

        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
