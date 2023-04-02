package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {


        //To get data from user in Java , we use "Scanner Class"
        //Steps to get data from user
        //1)Create a Scanner Class Object

        Scanner input=new Scanner(System.in);

        //1)Create a Scanner Class Object
        //Class Name   Object Name       Assignment Operator        new         Constructor
       // Scanner         input                   =                  new         Scanner(System.in);

        //2)Give a message to user
        System.out.println("Enter your age...");

        //Get the data from user by using "input" object
        byte age=input.nextByte();
        System.out.println("your age is "+age);





    }



}
