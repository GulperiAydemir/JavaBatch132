package ssg11whiledowhileLoop;

import java.util.Scanner;

public class DoWhileLoop13 {
    public static void main(String[] args) {
        // Ask from user for positive numbers to sum of this number,
        // press 0 to finish the process.
        // If the user wrongly  enters a negative number, ignore that number
        // and print "You cannot enter negative numbers" and return to the beginning
        // When the user presses 0, how many positive numbers are entered in total,
        // how many negative numbers you entered by mistake
        // and print the sum of the positive numbers it entered.


        Scanner scan =new Scanner(System.in);
        int number=1;
        int total=0;
        int counterPositive=0;
        int counterNegative=0;

        do {
            System.out.println("Please enter a positive integer\npress 0 to finish");
            number=scan.nextInt();
            if (number<0){
                System.out.println("You cannot enter negative numbers");
                counterNegative++;
            } else if (number>0){
                total+=number;
                counterPositive++;
            }

        } while(number !=0);
        System.out.println("Number of negative numbers entered by mistake: " + counterNegative);
        System.out.println("Number of positive numbers entered: " + counterPositive);
        System.out.println("sum of positive numbers entered: " + total );

    }
}
