package day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Get shirtPrice and shoePrice from user and print the total price on the console
        Scanner input = new Scanner(System.in);

        System.out.println("Give me shirt price, please...");
        double shirt = input.nextDouble();

        System.out.println("Give me shoes price, please...");
        double shoes = input.nextDouble();

        System.out.println("Total price is " + (shirt + shoes));

    }

}

