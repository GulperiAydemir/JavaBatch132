package smallstudygroup.scanner01;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // write a program that calculates the volume of a rectangular prism with length, width, height
        // Hint: the volume of the rectangle= width*height*length;
        Scanner input=new Scanner(System.in);

        System.out.println("please enter lengh");
        double lenght= input.nextDouble();

        System.out.println("please enter height");
        double height= input.nextDouble();

        System.out.println("please enter width");
        double width= input.nextDouble();


       double rectangle=(width*height*lenght);
        System.out.println(rectangle);




    }
}
