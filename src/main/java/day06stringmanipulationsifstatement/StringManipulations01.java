package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example:Type code to find the index of the first occurrence of 'a' in a given String
        //Alabama

        String s="Alabama";

       int idxofA=s.indexOf('a');
        System.out.println(idxofA);//2
        //indexof=will give you the index of first occurance of 'a'

        //Example 2:Type code to find the index of the first occurrence of 'java' in a given String
        //"java is easy to learn java is common in the market,java is OOP"==>2

        String t="java is easy to learn java is common in the market,java is OOP";
        //indexof(java);will give you the index of first character of the first occurance of "Java"
        int indexoft=t.indexOf("java");
        System.out.println(indexoft);

        //Note 1:if you use non-existing character or characters in indexofmethod ,'it will give you (-1)
        //Note 2:Index of method can be used with "char" and "String " data types

        String name="Gulperi";
        int nameInde=name.indexOf('a');
        System.out.println(nameInde);

        //Example 3:Type code to find the index of the last occurance of 'm' in a given String

        //miami==>
        String u="miami";
        int uLastOfInt=u.lastIndexOf('m');
        System.out.println(uLastOfInt);

        //Example 4:Type code to find the index of the last occurance of "earn" in a given String
        // Learn Java earn money==>

        String v="Learn Java earn money";
        int indearn=v.lastIndexOf("earn");
        System.out.println(indearn);//11


        //Note 1:if you use non-existing character or characters in lastindexofmethod ,'it will give you (-1)
        //Note 2:LastIndex of method can be used with "char" and "String " data types
        //Example 5 :Type code to check if a given character is unique or not in a given String
        //  miami==>'a'-->Unique -'i'-->Not Unique
     String y="miami";
     char ch='a';

      boolean r1=y.indexOf(ch)==y.lastIndexOf(ch);
      System.out.println("is the character unique " +r1);

        /*
        Note=When you type code should be careful about "coding standarts"

        i)Separete"data " and the main code"

         */




    }


}
