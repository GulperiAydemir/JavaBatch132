package ssg11whiledowhileLoop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        ////Question 1) Print numbers 1 to 5 (including 3 and 8) on the same line
        // ask the user to enter as many numbers as they want
        // if the sum of the numbers entered by the user exceeds 500
        // now you have entered enough numbers, the total is....

        Scanner input=new Scanner(System.in);


        int total=0;
        int number=0;

        do{
            System.out.println("Please enter a number");
            total=total+number;// total+=number
        }while (number<=5000);

        System.out.println("you have entered enough numbers, the total is...."+total);


    }
}
