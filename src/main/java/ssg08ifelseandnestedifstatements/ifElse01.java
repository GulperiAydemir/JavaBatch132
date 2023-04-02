package ssg08ifelseandnestedifstatements;

import java.util.Scanner;

public class ifElse01 {
    public static void main(String[] args) {


        // If we have a daily class, I can attend

        // If we have a night class, I can attend it

        boolean dt=false;
        boolean nt=true;

        //1*0
       // Let's find out if an input character is a letter or not

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter a Charterer ");
        String word= scan.next();
        int word1=word.replaceAll(("[^a-zA-z]"),"").length();


        if(word1>=0){
            System.out.println("has a character");

        }else{
            System.out.println("has not character");
        }
    }


}
