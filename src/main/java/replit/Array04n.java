package replit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Array04n {
    /*
Create a custom return type method accepts a name as parameter and prints the name as a char array.

(do not use toCharArray() method)


Input : John

Output :[J, o, h, n]

    */
     public static void main(String[] args) {

         String s = "John";
         String s2 = "";


         String s1 = null;
         for (int i = 0; i < s.length(); i++) {
             s1 = s.substring(i, i + 1);
             s2 = s1 + ',';
         }
         System.out.print(s2);
         String[] words = s2.split("");

         // System.out.print(Arrays.toString(words));
     }

                }

//          StringBuilder result = new StringBuilder();
//          for (int i = 0; i < k.length(); i++) {
//              if (i > 0) {
//                  result.append(",");
//              }
//              result.append(k.charAt(i));
//          }
//
//         System.out.println(Arrays.toString(new StringBuilder[]{result}));












