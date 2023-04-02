package ssgstatic;

public class Student {

String name;
String major;
static String collage;

static {
    collage ="cambridge";
}

    public static void main(String[] args) {

        Student s1=new Student ();
        s1.name="John";
        s1.major="Science ";
        s1.collage="Cambridge";


        Student s2=new Student ();
        s1.name="Gul";
        s2.collage="Cambridge";


    }
}
