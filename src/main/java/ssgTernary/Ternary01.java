package ssgTernary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
  /*
  Sayi 100 den b]y]kse karesini yazdir degilse 100 den buyuk sayi giriniz yazidirin
   */

        Scanner input=new Scanner(System.in);
        System.out.println("Plase enter  number greater then 100 ");
        int number=input.nextInt();

        if(number>100){
            System.out.println(number*number);
        }else{
            System.out.println("Please enter greater then 100");


        }
        Scanner input1=new Scanner(System.in);
        System.out.println("Plase enter  number greater then 100 ");
        int number2=input1.nextInt();

        System.out.println(number2%2==0 ?"cift sayi" :"Tek sayi ");

        int a=12;
        int b=-5;
         Object s=a>0 && b>0 ?a*b :"Nasil carpilir bilmiyorum";

        System.out.println(s);

    }
}
