package ssg12nestedforloop;

public class NestedLoop01 {
    public static void main(String[] args) {

        //Write a program that prints the below figure without a nested loop
        /*

         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *

         */

        //1 way
/*
        for (int i = 0; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print("*" + " ");
        }

 */

        //nested loop
        for (int i = 0; i <= 5; i++){
            System.out.print("*" + " ");

            for (int j =0; j <= 4; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
