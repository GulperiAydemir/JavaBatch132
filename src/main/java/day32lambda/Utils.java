package day32lambda;

import day33Lambda.Course;

import java.util.List;

public class Utils {

    public static void printInTheSameLineWithSpace(Object s) {
        System.out.print(s + " ");
    }

    public static int getSquare(int n) {
        return n * n;
    }

    public static int getSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {

            sum = sum + num % 10;//5
            num = num / 10;//4
        }
        return sum;//
    }

}
