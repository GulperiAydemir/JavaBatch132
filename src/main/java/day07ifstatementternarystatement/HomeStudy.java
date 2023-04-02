package day07ifstatementternarystatement;

import java.util.Scanner;

public class HomeStudy {
    public static void main(String[] args) {
        //Example 4 :Type Code to print the number of month for the given month name
        // February -->2   May -->5  December -->12     Tom-->Invalid month name

        String monthName="February";

        if(monthName.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if(monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if (monthName.equalsIgnoreCase("March")){
            System.out.println(3);

        }else {
            System.out.println("Invalid month name");

        }



        //Example 3: Type code to check if a number is "Even" or "Odd"
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println("number = "+"Even");

        }else{
            System.out.println("number = "+"odd");
        }



    }
}
