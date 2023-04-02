package ssginheritance;

public class Student extends Person{
    public long cardNumber;
    String major;

    public Student(String name,int age ,String major) {
        super(name, age);
        this.major = major;
    }





}
