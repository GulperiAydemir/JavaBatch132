package day18varargsstringbuilderstringbuffer;

import day19constructorsaccessmodifersstatic.Teacher;
import jdk.swing.interop.SwingInterOpUtils;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher yourTeacher=new Teacher();


        //1)If you are in a different package "default " variables will be "unaccesible"
        //2)If you are in a different package ant the class you created the object is not the "child class" "protected"variables
        //will be "inaccessible"
        //3)"privite" thinks can not be accessible from outside the class
        //4)"public" ones will be accessible from entire the project

        System.out.println(yourTeacher.teacherName);



    }
}
