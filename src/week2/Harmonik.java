package week2;

public class Harmonik {
    public static void main(String[] args) {

        int[] arr = {10, 2, 3, 4, 5};
        double toplam = 0.0;
        double harm;

        for (int j : arr) {


            toplam += (double) 1 / j;

        }
        harm = arr.length / toplam;
        System.out.println(harm);


    }
}
