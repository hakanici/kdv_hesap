package week6;


import java.io.BufferedReader;
import java.io.FileReader;

public class FileSum {
    public static void main(String[] args) {

        int sum = 0;

        try {
            FileReader fR = new FileReader("patika.txt");
            BufferedReader bR = new BufferedReader(fR);
            String line;

            while ((line = bR.readLine()) != null) {

                sum += Integer.parseInt(line.trim());


            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(sum);

    }
}
