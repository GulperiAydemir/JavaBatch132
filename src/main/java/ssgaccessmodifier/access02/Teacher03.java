package ssgaccessmodifier.access02;

import ssgaccessmodifier.access01.Student;

public class Teacher03 extends Student {
    public static void main(String[] args) {

        Student s1=new Student();
        System.out.println(Student.age);

        char a='A';
        char b='?';
        System.out.println(a+b);

        for(int i='A' ;i<'Z'; i++){
            System.out.print(i +" ");
            System.out.println("Asci deger" + " " +(char)i +" ");
        }
    }
}
