package ogrenciBilgiSistemi;

public class Course {

    String name;
    String code;
    String prefix;
    int note=0;
    int oralExam=0;
    Teacher teacher;

    Course(String name, String code, String prefix,int oralExam){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;


    }



    void print(){



    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;


        } else {
            System.out.println("Öğretmen ve Bölümler Uyuşmuyor !");
        }
    }



}
