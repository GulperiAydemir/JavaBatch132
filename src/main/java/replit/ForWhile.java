package replit;

import java.util.Arrays;

public class ForWhile {

    public static void main(String[] args) {

        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :

        String str=“Javaisalsoeasy”
        Output: [a, s]

         */
        String s = "Javaisalsoeasy";
        String s2 = "";


        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i, i + 1);
            if (s.indexOf(s1) != s.lastIndexOf(s1)) {
                if (!s2.contains(s1)) {
                    s2 = s2 + s1;

                }
            }

        }

        String[] str = s2.split("");
       System.out.println(Arrays.toString(str));
    }
}


