package javaquestionbank;

import java.util.Scanner;

public class SwitchStatement04 {
    /*
    Print "Boy" if the gender is "Male" (Ignore cases)
Print "Girl" if the gender is "Female" (Ignore cases)
Print "Others" if the gender is different from "Male" and "Female"
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender");
        String gender=input.next().toLowerCase();


        switch (gender){
            case "girl":
                System.out.println("Female");
                break;
            case "boy":
                System.out.println("Male");
                break;
            default:
                System.out.println("Others");

        }



    }
}
