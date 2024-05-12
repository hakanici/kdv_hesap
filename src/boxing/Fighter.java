package boxing;

public class Fighter {

    String name;
    int damage;
    int hp;
    int weight;
    int dodgeChance;




    Fighter(String name, int damage, int hp, int weight, int dodgeChance){
        this.name=name;
        this.damage=damage;
        this.hp=hp;
        this.weight=weight;
        this.dodgeChance=dodgeChance;


    }

    int hit(Fighter foe){
        System.out.println(this.name + " --> " +foe.name + "\'e " + this.damage + " hasar vurdu.");
        if(isDodge()){
            System.out.println(foe.name+ " Blokladı!");
            return foe.hp;
        }
        if(foe.hp-this.damage<0){
            return 0;
        }
        return foe.hp-this.damage;
    }

    boolean isDodge(){
        double randomNumber1=Math.random()*100;
        return randomNumber1<=this.dodgeChance;
    }





}
