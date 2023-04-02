package javaquestionbank;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
 /*
        Create double variables for the prices of any 3 items. Print the sum of the prices on the
        console with a label.


  */
        double shirt=12.99;
        double shoe=15.99;
        double skirt=16.99;
        double sum=shirt+shoe+skirt;
        System.out.println(sum);

        /*
        Create a float variable, a long variable, and an integer variable for any 3 items. Print the
multiplication of the values on the console with a label.
         */
        float a=11.99F;
        long  b=1234;
        int   c=44;
        double mul=a*b*c;
        System.out.println(a*b*c);
        /*
        Type a code to find simple interest.
        Note: Simple interest formula = principal * rate * numberOfYear / 100
         */
     int principal =500;
     double rate=2.5;
     byte year=10;
        System.out.println( (principal * rate * year) / 100);
        /*
        Create a String and two Long variables. Print the sum and the multiplication of the long
variables with the String on the console.
         */
       String s="Java";
       long l=1356;
       long h=343;
        System.out.println(s+" "+(l+h));
        System.out.println(s+" "+(l*h));
        /*
        Create two boolean variables whose values are different and print their values in the same
line with a space between two consecutive values.
         */

     boolean e=true;
     boolean f=false;
        System.out.println(e +" "+f);

        /*
        Create 3 float variables for the price of a book, notebook, and laptop.
Print the total price of 2 books, 4 notebooks and 3 laptops on the console

         */

        float book=12.99F;
        float notebook=13.99F;
        float laptop=14.99F;
        float totalPrice=2*book +4*notebook+3*laptop;
        System.out.println("totalPrice = " + totalPrice);

        /*
        Type a code to swap two integers.
         */
      int k=5;
      double kDouble=k;
        System.out.println(kDouble);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Before swapping: " + n1 + " - " + n2);
    }

}
