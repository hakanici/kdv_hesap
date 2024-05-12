package ogrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;



    Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
void print(){
    System.out.println("Öğretmenin Adı : "+this.name);
    System.out.println("Öğretmenin Teli : "+this.mpno);
    System.out.println("Öğretmenin Bölümü : "+this.branch);
}


}
