package ssg12nestedforloop;

public class NestedLoop02 {
    public static void main(String[] args) {
/*

 *
 * *
 * * *
 * * * *
 * * * * *
 */

        int input = 6;

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();

        }
    }
}
