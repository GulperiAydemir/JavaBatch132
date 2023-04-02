package ssgmethodcreation;

public class Calculator {

    public static void main(String[] args) {

        add(3, 5);
        substract(2,5);
        multiple(2,6);
        device(5,6);


    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void substract(int a, int b) {
        System.out.println(a - b);

    }
    public static void multiple(int a, int b) {
        System.out.println(a * b);

    }
    public static void device(int a, int b) {
        System.out.println(a /b);

    }
}
