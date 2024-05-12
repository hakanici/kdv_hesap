package ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {


        Teacher t1=new Teacher("Burak","551","KMY");
        Teacher t2=new Teacher("Hakan","444","FZK");
        Teacher t3=new Teacher("Ebru","606","TRH");


        Course kimya=new Course("Kimya","101","KMY",20);
        kimya.addTeacher(t1);
        Course fizik=new Course("Fizik","101","FZK",30);
        fizik.addTeacher(t2);
        Course tarih=new Course("Tarih","101","TRH",40);
        tarih.addTeacher(t3);

        Student s1=new Student("Aslı","123","4",kimya,fizik,tarih);
        s1.examNote(80,40,60,70,90,80);
        s1.isPass();





    }
}
