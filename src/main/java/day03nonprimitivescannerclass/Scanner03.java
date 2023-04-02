package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Ask user to enter width and the lenght of rectangle,then calculate
        //perimeter and the area of the ractangle.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter width and lenght of the rectangle");
        double width = input.nextDouble();
        double lenght =input.nextDouble();
        System.out.println("Perimeter: "+ (2*width + 2*lenght));
        System.out.println(" Area  "+ width*lenght);







    }




}
