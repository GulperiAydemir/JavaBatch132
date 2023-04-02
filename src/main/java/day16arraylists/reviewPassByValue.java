package day16arraylists;

import com.sun.java.accessibility.util.GUIInitializedListener;

public class reviewPassByValue {
    public static void main(String[] args) {
        //Create a method prints the sum of the ASCII values of characters in a String
        int r1 = sum("Gulperi");
        System.out.println(r1);

    }

    private static int sum(String A) {
        int sum = 0;
        for (int i = 0; i < A.length(); i++) {
            sum = sum + A.charAt(i);
        }
        return sum;

    }
}






