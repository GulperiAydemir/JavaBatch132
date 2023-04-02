package ssgaccessmodifier.access01;

public class Student {

    public String name;
    protected static int age;

    String hobby;
    private int id;

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.id);



    }
}
