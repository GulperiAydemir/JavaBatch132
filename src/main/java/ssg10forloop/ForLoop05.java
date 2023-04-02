package ssg10forloop;

import java.util.Scanner;

public class ForLoop05 {
    public static void main(String[] args) {
        /*
        Birden 10 a kadar belirlenen sayinin carpim sonuclarini yaziniz
         */

//        int num = 2;
//
//        for (int i = 1; i < 11; i++) {
//            System.out.print(num + "x" + i +"=" +num*i + " ");


        Scanner input = new Scanner(System.in);
        System.out.println("100 den kucuk bir sayi giriniz");
        int num = input.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 3 == 0) {
                System.out.print("Java"+ " ");
            }else if (i % 5 == 0) {
                System.out.print("guzeldir" + " ");

            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Java guzeldir" +" ");
            }else System.out.print(i +" ");

            }

        }

    }







