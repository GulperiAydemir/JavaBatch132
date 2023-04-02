package day04stringmanipulations;

public class StringManipulations03 {

    public static void main(String[] args) {

        //Example 1:Check the password if is has following rules.
        //    i)It should start with "J"
        //    ii)It should have at least 8 characters
        //   iii)Last 3 characters should be "AVA"

        String pwd="J12!?AVO";

        //i)It should start with "J"

        boolean first =pwd.startsWith("J");
        System.out.println("First Rules "+first);

        //ii)It should have at least 8 characters
        //Note:There are "comparison operators" in Java : "==" , "<" ,">,"<=",">=","!="
        //     When you use comparison operators,you will get "boolean" everytime

        boolean second=pwd.length()>7;
        System.out.println("Second Rules "+second);

        //iii)Last 3 characters should be "AVA"
        //Note:If you want to get characters from an index to the last character;
        //     use "substring()" method just with the starting index

       boolean third =pwd.substring(5,8).equals("AVA");
        System.out.println("Third Rules "+third);

        /*
        What we learnd today
        1.charAt ()==>char Data type
        2.toUperCase()==>String
        3.toLowerCse()==>String
        4.trim()==>String
        5.split()==>We will learn it later
        6.lenght()==>int
        7.substring(begening index, Ending Index)==>String
        8.substring(beginning)==>String
        9.equals()==>boolean
        10.equalsIgnoreCase()==>boolean
        11.startsWith()==>boolean

        Note=When you learn method in Java ,you should learn
        i)What does the method do?
        ii)What are the different usages?
        iii)What does the method give you ?

         */



    }
}
