package practices.practise02;

import java.util.Scanner;

public class QH02 {
    public static void main(String[] args) {
        /*
    Modulus Operator==>in Java % is called modulus operator
    It returns the "remainder" in a division operation
    13/5 ==>3 ==> 13%5 ==> 3
     */
        //Ask user to enter an integer then print "Even" on the console if the number is even.

        Scanner input=new Scanner(System.in);
        System.out.println("please enter number");
        int numb=input.nextInt();
        System.out.println("is there even umber "+ (numb%2==0));

        Scanner input1=new Scanner(System.in);
        System.out.println("enter number");
        int oddNumb=input.nextInt();
        System.out.println("odd number "+(oddNumb%2!=0));









    }

}
