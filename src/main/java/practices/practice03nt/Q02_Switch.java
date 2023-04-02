package practices.practice03nt;

import java.util.Scanner;

public class Q02_Switch {
    public static void main(String[] args) {

        //Ask user to enter a chracater ,if it is "vowel" or if it is "not vowel"

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a character");

        char c = input.next().toLowerCase().charAt(0);

        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;

            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'y':
            case 'z':
                System.out.println("not vowel");
                break;

            default:
                System.out.println(("Inter a letter ,not other characters..."));
        }



    }
}
