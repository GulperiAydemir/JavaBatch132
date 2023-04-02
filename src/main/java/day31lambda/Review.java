package day31lambda;

import java.util.ArrayList;
import java.util.List;

public class Review {

    public static void main(String[] args) {

        //1)Create a method to print all list elements on the console in the same line with a space among them

        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(15);
        num.add(20);
        num.add(5);
        num.add(7);
        num.add(11);

        printElement(num);
        System.out.println();
        printElement(num);
        System.out.println();
        printEvenList(num);
        System.out.println();
        printEvenList2(num);
        System.out.println();
        calculateSquare(num);
        System.out.println();
        calculateSquare1(num);
        System.out.println();
        findValueLess15(num);

    }

    //1.way:
    public static void printElement(List<Integer> num) {
        for (int w : num) {
            System.out.print(w + " ");
        }

        //2.way

    }

    public static void printElement2(List<Integer> num) {
        num.stream().forEach(t -> System.out.print(t));
        // //2)Create a method to print the "even" list elements on the console

    }

    public static void printEvenList(List<Integer> num) {
        for (Integer w : num) {
            if (w % 2 == 0) {
                System.out.print(w);


            }
        }
    }

    public static void printEvenList2(List<Integer>num){
        num.stream().filter(t->t%2==0).forEach(t-> System.out.print(t));
    }

    //3)Create a method to print the square of odd list elements on the console
    // in the same line with a space between two consecutive elements.
    public static void calculateSquare(List<Integer>num){
        for(Integer w:num){
            if(w%2!=0){
                System.out.print(w*w+"");
            }
        }
    }
    public static void calculateSquare1(List<Integer>num){
        num.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t));
    }

    //10)Create a method to find any value which is less than 15 and even from the list

    public static void findValueLess15(List<Integer>num){
        num.stream().distinct().filter(t->t%2==0&&t<15).findAny().get();
    }
}



