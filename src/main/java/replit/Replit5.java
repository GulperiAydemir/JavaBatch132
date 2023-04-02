package replit;

import java.util.Scanner;

public class Replit5 {
    public static void main(String[] args) {
        /*
 Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)

Sample:
INPUT:
  Input a month number: 2
  Input a year: 2016

          OUTPUT  :

        February 2016 has 29 days
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter month and year");
        byte month=input.nextByte();
        int year=input.nextInt();


        switch(month){
            case 1:
                System.out.println("January has 30 day");
                break;
            case 2:
                String res1=year%400==0 ?"has 28 day" :"has 29 day";
                System.out.println("January" + res1);
                break;
            case 3:
                System.out.println("March has 30 day");
                break;
            case 4:
                System.out.println("April has 30 day");
                break;
            case 5:
                System.out.println("May has 30 day");
                break;
            case 6:
                System.out.println("June has 30 day");
                break;
            default:
                System.out.println("Please enter valid number");





        }

    }
}
