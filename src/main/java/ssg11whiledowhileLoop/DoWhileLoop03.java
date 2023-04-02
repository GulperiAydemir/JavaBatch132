package ssg11whiledowhileLoop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
        // ask from user to enter a  numbers  find the sum of number
        // and continue until the user presses 0
        // when the user presses 0
        // print the sum of all the numbers entered

        Scanner scan = new Scanner(System.in);

        int number=1;
        int total=0;

//        do {
//            System.out.println("Please enter a number");
//            number= scan.nextInt();
//            total+=number;
//        }while(number!=0);
//        System.out.println(total);

        // 2nd way
//        while (number!=0){
//            System.out.println("Please enter a number");
//            number= scan.nextInt();
//            total+=number;
//        }
//        System.out.println(total);




        // for loop is more advantages when the start, end pint  and change values are define
        // but the while loop is more advantages in cases where the number of steps is not clear
        // 3 .yol

        for (int i = 1; i < 1000000 ; i++) {
            System.out.println("Please enter a number");
            number= scan.nextInt();

            if (number==0){
                break;
            } else {
                total+=number;
            }

        }


        System.out.println(total);

    }
}