package kelimeBul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KelimeBul {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Metin Giriniz: ");
        String text=sc.nextLine();

        String[] words=text.split("\\s+");

        HashMap<String,Integer>wordCount=new HashMap<>();

        for(String word: words){
            word=word.toLowerCase();
            if(wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word)+1);
            }
            else {
                wordCount.put(word,1);
            }
        }

        String mostFrequentWord=null;
        int maxCount=0;
        for(Map.Entry<String,Integer> entry:wordCount.entrySet()){
            if(entry.getValue()>maxCount){
                mostFrequentWord=entry.getKey();
                maxCount=entry.getValue();
            }
        }

        if(mostFrequentWord!=null){
            System.out.println("En çok geçen kelime: "+ mostFrequentWord);
            System.out.println("Geçiş Sayısı: "+ maxCount);
        }else{
            System.out.println("Kelime Bulunamadı");
        }






    }




}
