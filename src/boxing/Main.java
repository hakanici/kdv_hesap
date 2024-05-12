package boxing;

public class Main {
    public static void main(String[] args) {

        Fighter f1=new Fighter("Rocky",20,120,90,20);
        Fighter f2=new Fighter("Mike",30,100,100,30);

        Match match=new Match(f1,f2,90,100);
        match.fight();









    }


}
