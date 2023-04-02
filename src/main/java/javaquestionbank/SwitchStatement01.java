package javaquestionbank;

import java.util.Scanner;

public class SwitchStatement01 {
    /*
    Use switch statement to print
a) "Winter" for December, January, February
b) "Spring" for March, April, May
c) "Summer" for June, July, August
d) "Fall" for September, October, November
e) "Invalid month name" for all the others
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a month");
        String month=input.next();
       String monthname=month.toLowerCase();

        switch(month) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "agust":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Autumun");
                break;
            default:
                System.out.println("Please give valid name");

        }



    }
}
