package SSG0808Varargs;

public class Varargs01 {
    public static void main(String[] args) {
        /*
        Create a method called printVarargs that accepts a variable number of arguments of int and prints each
        argument on a new line. Test the method by calling it with various arguments.


         */


    }

    public static void printVarargs(int...nums){
        for(int i : nums){
            System.out.println(i);
        }

    }

}
