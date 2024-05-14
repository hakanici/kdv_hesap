package week2;


public class Transpoz {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}

        };

        int[][] tranzpozeMatris = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                tranzpozeMatris[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpoze Matris:");
        for (int i = 0; i < tranzpozeMatris.length; i++) {
            for (int j = 0; j < tranzpozeMatris[0].length; j++) {
                System.out.print(tranzpozeMatris[i][j] + " ");
            }
            System.out.println();
        }


    }
}
