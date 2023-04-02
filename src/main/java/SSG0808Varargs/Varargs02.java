package SSG0808Varargs;

public class Varargs02 {
    /*
    Create a method called sumVarargs that accepts a variable number of integer arguments and returns the sum of all the integers.
Test the method by calling it with different numbers of arguments.
     */

    public static void main(String[] args) {

    }

    public static int sumNum(int... numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }
        return sum;
    }
}
