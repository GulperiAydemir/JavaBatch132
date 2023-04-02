package day16arraylists;

import java.io.PrintStream;

public class Homework {
    public static void main(String[] args) {

        int r1=getAdd(5,3);
        System.out.println(r1);

        String r2=firstAndLastchar("Gulperi");
        System.out.println(r2);

        int r3=totalAsciiValue("gulp");
        System.out.println(r3);


}
    //Create a method adds two integers
    public static int getAdd(int x,int y){
        return x+y;


    }


    //Create a method prints the first and the last character on the console
    public static String firstAndLastchar(String name){
        return name.charAt(0) + " " +name.charAt(name.length()-1);


    }

    //Create a method prints the sum of the ASCII values of characters in a String

     public  static int totalAsciiValue(String name) {

         int sum = 0;

         for (int i = 0; i < name.length(); i++) {
             sum = sum + name.charAt(i);

         }
         return sum;
     }


}

