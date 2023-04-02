package replit;

import ssgconstractor.Person;

public class Student {
    /*

 Create a student's variables in the main method and use this assign variables
 create a method named Changename, student as parameter
 get the information and change all the information in the method and add the new information
 have it print
 The line where we call the Rename method in the Main method is immediately then reprint student information
 Create a method named changesurname, this method is "lastname" as parameter get the variable. In the method, ask the user to enter a new last name and
 change the old last name (i.e. can).

     */

    String firstName;
    String lastName;


    public Student(){}
    public Student(String f, String l){
        firstName=f;
        lastName=l;
    }


    public static void main(String[] args) {


        Student newName=new Student("Elvira"," Deger");
        Student changeName=new Student("Ela"," Direm");
        System.out.print(newName.firstName);
        System.out.println(newName.lastName);
        System.out.print(changeName.firstName);
        System.out.println(changeName.lastName);





    }

}
