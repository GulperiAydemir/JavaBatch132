package ssg08ifelseandnestedifstatements;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ifElseIf01 {
    public static void main(String[] args) {

        // Question 2) Ask the user for a score of more than 100.
        // Convert the note to character system and print it.
        // "D" if less than 50,
        // =50 <60 "C",
        // =60 <80 between "B",
        // "A" if greater than 80;

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter your score");
        int score= scan.nextInt();

        if(score <0 ||score> 101)
            System.out.println("Please enter valid number");

        if(score<50) {
            System.out.println("D");
        }else if(score<51 ){
            System.out.println("C");
        }else if(score<60) {
            System.out.println("B");
        }else if(score<80) {
            System.out.println("B");
        }else {
            System.out.println("A");
        }

    }
}
