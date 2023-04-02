package replit;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        /*
        Ask user for a string and print a new string made of 3 copies of the last 2 letters

The strings length will be at least 2.

 Sample:

INPUT       : Mustafa
OUTPUT      : fafafa
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter name");
         String name= input.next();
       if(name.length()>2){
           String nn= name.substring(name.length()-2);
           System.out.println(nn.repeat(3));

       }else{
           System.out.println("Enter more 2 letters");
       }


    }
}
