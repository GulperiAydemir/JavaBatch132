package javaquestionbank;

public class Loop08 {
    /*
    Type code to print odd integers from 20 to 3 in the same line with a space between two
consecutive ones.
     */
    public static void main(String[] args) {
        for(int i=20; i>3 ;i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
        }

    }

}
