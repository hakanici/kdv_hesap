package ogrenciBilgiSistemi;

public class Student {

    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average1;
    double average2;
    double average3;

    boolean isPass;

    Student(String name, String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average1=0.0;
        this.average2=0.0;
        this.average3=0.0;
        this.isPass=false;

    }

    void examNote(int note1,int note2,int note3, int oralExam1,int oralExam2,int oralExam3) {
        if (note1 >= 0 && note1 <= 100 && oralExam1>=0 && oralExam1<=100) {
            this.c1.note = note1;
            this.c1.oralExam=oralExam1;
        }
        if (note2 >= 0 && note2 <= 100 && oralExam2>=0 && oralExam2<=100) {
            this.c2.note = note2;
            this.c2.oralExam = oralExam2;
        }
        if (note3 >= 0 && note3 <= 100 && oralExam3>=0 && oralExam3<=100) {
            this.c3.note = note3;
            this.c3.oralExam = oralExam3;
        }
    }
    void isPass(){
        this.average1=(this.c1.note*0.80 + this.c1.oralExam*0.20) + (this.c2.note*0.70 + this.c2.oralExam*0.30) +(this.c3.note*0.60 + this.c3.oralExam*0.40);
        this.average2=this.average1/3;


        if(this.average2>55){
            System.out.println("Sınıfı Başarılı bir Şekilde Geçtiniz!");
        }else{
            System.out.println("Kaldınız!");
        }

        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name+" Sınav Notu:"+this.c1.note+" --"+" Sözlü Notu:"+this.c1.oralExam);
        System.out.println(this.c2.name+" Sınav Notu:"+this.c2.note+" --"+" Sözlü Notu:"+this.c2.oralExam);
        System.out.println(this.c3.name+" Sınav Notu:"+this.c3.note+" --"+" Sözlü Notu:"+this.c3.oralExam);

        System.out.println("Ortalamanız : "+this.average2);
    }

}
