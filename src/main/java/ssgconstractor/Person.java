package ssgconstractor;

public class Person {



    String name;
     int age;
    String job;

    public Person (){}

    public Person (String name,int age,String job){
        this.name=name;
        this.age=age;
        this.job=name;

    }

    public static void main(String[] args) {
        Person man=new Person("John",35,"Manager");

        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.job);


    }


}
