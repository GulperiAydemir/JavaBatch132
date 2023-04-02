package javaquestionbank;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatement03 {
    /*
Type a code which prints the all month names starting with the given month numbers.
Example: If the month number is 9 output will be September October November December
     */
    public static void main(String[] args) {
       //List<String> futureMonths = new ArrayList<>();
        int month = 8;
        switch (month) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                break;
        }


        }
    }

