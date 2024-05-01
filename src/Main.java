import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        if(N>=1 && N<=100)
        {
            if((N>=2 && N<=5) && (N%2==0) || (N>20 && N%2==0))
            {
                System.out.print("Not Weird");
            }
            else if(N%2==1){
                System.out.print("Weird");
            }
        }








        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}