package ssg09switch;

import java.util.Scanner;

public class Switch01 {
    //write a program to check Vowel or Consonant letters in English:
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an english character");

        char ch = input.next().charAt(0);//

        switch (ch) {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'Z':

             System.out.println("vowel  letter");
             break;

            default:
                System.out.println("cononant letter");
        }
    }
}