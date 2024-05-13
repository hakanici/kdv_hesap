package week2;

import java.util.Arrays;

public class Cift {
    public static void main(String[] args) {

        int[] list={1,2,3,2,4,2,5,4,6,7,7,8,11,13,8,19};
        int[] duplicate=new int[list.length];
        int startIndex=0;

        for(int i=0; i< list.length; i++){
            for(int j=0; j< list.length; j++){
                if(i!=j && list[i]==list[j] && list[i]%2==0){
                    if(!isFind(duplicate,list[i])){
                        duplicate[startIndex++]=list[i];

                    }
                    break;
                }
            }
        }
        for(int value: duplicate){
            if(value!=0){
                System.out.println(value);
            }
        }


    }

    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i==value){
                return true;

            }
        }
        return false;
    }
}
