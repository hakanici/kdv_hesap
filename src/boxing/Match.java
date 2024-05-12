package boxing;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2, int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    public void fight(){
        if(isCheck()){
            while (f1.hp>0 && f2.hp>0){
                System.out.println("---------");
                if(firstHit()) {
                    this.f2.hp = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                }
                else {
                    this.f1.hp = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }

                System.out.println(this.f1.name + " Health : " + this.f1.hp);
                System.out.println(this.f2.name + " Health : " + this.f2.hp);

            }


        }
        else{
            System.out.println("Sikletler Uyuşmuyor!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if(this.f1.hp==0){
            System.out.println(f2.name + " KAZANDI !");
            return true;
        }
        if(this.f2.hp==0){
            System.out.println(f1.name + " KAZANDI !");
            return true;
        }
        return false;

    }

    boolean firstHit(){
        double randomNumber2=Math.random()*100;
        if(randomNumber2<50){
            return true;
        }
        else
            return false;
    }



}
