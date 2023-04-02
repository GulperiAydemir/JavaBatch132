package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        do {
            System.out.println("Enter to integer to play");
            int num = input.nextInt();
            if (num < 0) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost");
                break;
            }


        }while(true);

         /*
         Username is "admin", Password is "pwd123"
         Ask user to enter username and password
         User should see "Enter your username and password" message
         If he enters correct credentials he should get "You are in your account!" message
         Otherwise, he should see "Enter your username and password" message 3 times
         After 3 times he should get "Your account is blocked" message

        */


     Scanner scan=new Scanner(System.in);

       int i=0;

        do {
            if(i>4){
                System.out.println("System was blocked");
                break;

            }
            System.out.println("Please enter your username and password");

            String usernameandpassword = scan.nextLine();


            if (usernameandpassword.equals("admin"+"pwd123")) {
                System.out.println("you are in your account!");
                break;
            } else {

                System.out.println("You try again");


            }
             i++;
            } while (true) ;







    }
}
