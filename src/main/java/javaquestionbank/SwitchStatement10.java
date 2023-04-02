package javaquestionbank;

import java.util.Scanner;

public class SwitchStatement10 {
    public static void main(String[] args) {
        /*
         /*
        Create a method which gives you a random alphabetical character in myClass Class then
print the following by using the method.
Print "First Character" for 'A' and 'a'
Print "Second Character" for 'B' and 'b'
Print "Third Character" for 'C' and 'c'
Print "Forth Character" for 'D' and 'd'
Print "Other Characters" for all others
         */

//        public class myClass {
//            public static String getRandomAlphabet(){
//                String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//                int maxIndex = alphabets.length()-1;
//                int randomIndex = (int)Math.round(Math.random()*maxIndex);
//                return alphabets.substring(randomIndex, randomIndex+1);
//            }
//        }
        Scanner input=new Scanner(System.in);
        System.out.println("enter letter");
         String character = input.next();


       character.toLowerCase();

        switch(character){
            case "a":
                System.out.println("first character");
                break;
            case "b":
                System.out.println("second character");
                break;
            case "c":
                System.out.println("third character");
                break;
            case "d":
                System.out.println("fourt character");
                break;
            default:
                System.out.println("Other characters");

        }


    }
}
