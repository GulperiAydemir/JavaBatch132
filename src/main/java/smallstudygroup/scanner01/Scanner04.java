package smallstudygroup.scanner01;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        // ask  the user to enter two integer, and then
        // If the integer is even, write "Even"
        // If the integer is odd, write "Odd"

        Scanner input = new Scanner(System.in);
        System.out.println("please enter  a number");

        int num1 = input.nextInt();
        System.out.println("please enter  a number");

        if (num1 % 2 == 0) {
            System.out.println("even");


        } else {
            System.out.println("odd");
        }
      //2ndway with Turnery
        int a=input.nextInt();
        String result=a%2==0?"even":"odd";
        System.out.println(result);
    }
}

