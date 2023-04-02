package replit;

import java.util.Scanner;

/*
   Ask user to type a name,

the length of name should be 3.

Then check if the name has same characters.

If the String has same characters

Print “String has duplicate characters”
Else
Print “String has unique characters”
Please use ternary.

Input :
ala
OutPut:

String has duplicate characters

    */


public class IfQuestion {
    public static void main(String[] args) {


        // Scanner input = new Scanner(System.in);

        // System.out.println("Please enter a name");
        //String name = input.nextLine();


        // String newname =name.indexOf(name) == name.lastIndexOf(name)  ?  "String has unique characters" :"String has duplicate characters";
        // String newname =name.length() == 3 && result==true ?  "String has unique characters" :"String has duplicate characters";

        //System.out.println(newname);


        String s = "ala";
        //String result = name.charAt(0)==name.charAt(1) || name.charAt(0)==name.charAt(2) || name.charAt(1)== name.charAt(2) ? "String has duplicate characters" : "String has unique characters";
        //System.out.println(result);

        for (int i = s.length() - 1; i > -1; i--) {
            char c = s.charAt(i);
           String result=s.indexOf(c) == s.lastIndexOf(c) ? " has unique" :"has duplicate characters";
            System.out.println(result);
        }

    }
}