package replit;

public class List08 {
    public static void main(String[] args) {
/*

Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.

Input :

I love Java.

Output:

Reversed sentence : avaJ evol I.
It is not a palindrome"
 */

                String sentence = "I love Java.";
                String reversed = new StringBuilder(sentence).reverse().toString();
                System.out.println("Reversed sentence: " + reversed);

                 //remove whitespace and convert to lowercase for palindrome check
                String original = sentence.replaceAll("\\s", "").toLowerCase();
                String reversedLowerCase = reversed.replaceAll("\\s", "").toLowerCase();

                if (original.equals(reversedLowerCase)) {
                    System.out.println("It is a palindrome");
                } else {
                    System.out.println("It is not a palindrome");
                }
            }
        }

