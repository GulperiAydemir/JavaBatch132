package ssg10forloop;

import java.util.Scanner;

public class ForLoop06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int num = input.nextInt();

        for (int i = 1; i < num; i++) {
            for (int k = num; k > i; k--) {

                System.out.print("*" + "");

            }
            System.out.println();

        }

    }
}
