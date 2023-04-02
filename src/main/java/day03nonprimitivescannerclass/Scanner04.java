package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

      /*
   Type a program which calculates the volume of a rectangular prism
   whose length, width, and height are entered by user.
   Hint 1: Volume of a rectangular prism is width x length x height

*/
        Scanner input =new Scanner(System.in);//first step

        System.out.println("Enter lenght ,width, height please...");//second step

        double lenght=input.nextDouble(); //third step
        double width = input.nextDouble();
        double height=input.nextDouble();

        System.out.println("Volume of a rectangular prism is: "+( width * lenght * height ));//fourt step




    }
}
