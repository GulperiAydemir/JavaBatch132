package day05stringmanipulations01;

import jdk.swing.interop.SwingInterOpUtils;

public class PracticeDay05 {
    public static void main(String[] args) {

        //Example 5: Check the user's password according to the given rules
        //           i)Password should have at least 8 characters
        //           ii)Password should not have "space" character
        //           iii)Password should have at least 1 upper case
        //           iv)Password should have at least 1 lower case
        //           v)Password should have at least 1 symbol
        //           vi)Password should have at least 1 digit

        String pwd = "As1?fdes3";

        boolean rule1=pwd.length()>7;
        System.out.println("rule1 = " + rule1);

        boolean rule2=pwd.replaceAll("[^ ]","").length()==0;
        System.out.println("rule2 = " + rule2);
        boolean rule3=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("rule3 = " + rule3);

        //Example 4: Count how many letters are there in a String
        //Logic: i)Delete all characters different from letters
        //       ii)Count the remaining characters
        String m = "Tom, are you here?";
        m.replaceAll("[^a-zA-Z]","").length();

    }



}
