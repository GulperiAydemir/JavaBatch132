package day06stringmanipulationsifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*
        If you study hard you will get offer soon
        Note:To execute our codes under some conditions We use "if statement"
         */
        //Example 1=if a number is positive,print positive on the console
         int a =0;

        //1.Way
        if (a>0){
            System.out.println("positive");

        }

    if (a<0){
        System.out.println("negative");
    }

    if (a==0){
        System.out.println("Neutre");
    }
   //2 Way
        if(a>0){
            System.out.println("positive");

        }else if (a<0){
            System.out.println("negative");
        }else if (a==0){
            System.out.println("Neutre");
        }
    //Example 2=Type code that prints day names for the given day numbers

       //1==>Sunday ,2 ==>Monday ,....7==>Saturday

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter day number to see day name ");
        byte dayNum=input.nextByte();

        if(dayNum==1){
            System.out.println("Sunday");
        }else if(dayNum==2){
            System.out.println("Monday");
        }else if(dayNum==3){
        System.out.println("Thuesday");
        } else if(dayNum==4){
            System.out.println("Wednesday");
        }else if(dayNum==5){
            System.out.println("Thuesday");
        }else if(dayNum==6){
            System.out.println("Friday");
        }else if(dayNum==7) {
            System.out.println("Saturday");
        }else{
            System.out.println("I told you to enter day numbers,are you good...");
        }


    }

}
