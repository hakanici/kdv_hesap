package week6;

import java.io.*;
import java.util.Scanner;

public class NotePad {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("text : ");
        String line=sc.nextLine();
        String path="notepad.txt";

        try {
            FileWriter fW=new FileWriter(path,true);
            BufferedWriter bW=new BufferedWriter(fW);
            bW.write(line);
            bW.newLine();
            bW.close();
            FileReader fR=new FileReader("notepad.txt");
            BufferedReader bR=new BufferedReader(fR);
            String readText;
            while((readText= bR.readLine())!=null){
                System.out.println(readText);
            }
            bR.close();



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
