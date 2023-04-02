package ssg09switch;

import java.util.Scanner;

public class Swich02 {
    public static void main(String[] args) {
        // Gets the number of months from the user and prints the season.
        // create switch

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter valid number for moth...");

        int monthNo=input.nextInt();

        switch(monthNo){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Please enter valid month number...");
        }


    }
}
