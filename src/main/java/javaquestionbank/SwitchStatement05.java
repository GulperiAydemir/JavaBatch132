package javaquestionbank;

import java.util.Scanner;

public class SwitchStatement05 {
    public static void main(String[] args) {
        /*
        Type a code to display the number of days in a given month of a given year.
        Example: The number of days in February of 2000 was 29.
         */

            Scanner input=new Scanner(System.in);
            System.out.println("Please enter year");
            int year=input.nextInt();
            System.out.println("Please enter month");
            int month=input.nextInt();

            int day=0;

            switch (month){
                case 1: case 3: case 5:
                case 7: case 8: case 10:
                case 12:
                    day = 31;
                    break;
                case 6: case 9: case 11:
                        day=30;
                break;

                case 2:
                    if(year%4==0||year%100==0||year%400==0){
                        day=29;
                    }else {
                        day=28;
                        break;
                    }
                default:
                    System.out.println("please enter valid number ");
            }
        System.out.println(day);
        }
}
