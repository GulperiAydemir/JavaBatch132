package b132practices.practise03;

import java.util.Scanner;

public class Q01_NestedForLoop_Matrix {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        //System.out.println("Enter an integer");
        //int number=input.nextInt();

        int number = 9;


        for (int i = 0; i < 3; i++) {
            System.out.print((int) (Math.random() *100)+" ");


            for (int j = 0; j < number; j++) {
                System.out.print((int) (Math.random() * 100) + "  ");

            }

            System.out.println();

        }







        /*
    Ask user to enter a number and print on console number by number matrix.
    Example:
    Input: 10
    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0
    */


    }
}



