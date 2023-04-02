package replit;

import java.util.Scanner;

public class ForWhile01 {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2
         */
        char ch1= 'a' ;

        String name ="John came late";

        int sum=0;
        for(int i=0; i<name.length();i++){
            String ch = name.substring(i, i+1);
            System.out.print(ch);
            if(ch.equals("a")){
                sum=sum+1;

            }

        }
        System.out.println(sum);
    }

}
