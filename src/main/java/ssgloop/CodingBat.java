package ssgloop;

public class CodingBat {
    public static void main(String[] args) {
        /*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
         */

        String name = "<<>>";
        String name2 = "Yay";

        StringBuilder nname = new StringBuilder(name);
        nname.insert(2, name2);
        System.out.println(nname);

        /*
        Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
         */


        String n = "Hello";

        for (int i = 0; i < 2; i++) {
            String lastTwo = n.substring(n.length() - 2);
            System.out.print(lastTwo);
        }

    }
}
