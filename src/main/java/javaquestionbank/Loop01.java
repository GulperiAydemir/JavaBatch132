package javaquestionbank;

public class Loop01 {
    /*
    Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
    with a space between two consecutive integers

     */
    public static void main(String[] args) {
        //1.way
        String s = "";
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                s = s + i + " ";
            }

        }
        System.out.println(s);

//2.way
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");

            }
        }
    }
}
