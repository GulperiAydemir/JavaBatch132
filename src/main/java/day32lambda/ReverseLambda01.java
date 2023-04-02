package day32lambda;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class ReverseLambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        printEelements(names);
        System.out.println();
        printElementAccordingtolenghtsUpperUnrepeadetly(names);
        System.out.println();
        printElementAccordingtolastsUpperUnrepeadetly(names);
        System.out.println();
        printElementAccordingtolenghtsUpperUnrepeadetly(names);
        System.out.println();
        takesquareoflenght(names);
        //1)Print the list elements on the console in natural order, with upper cases, and un-repeatedly

    }

    public static void printEelements(List<String> names) {
        names.stream().distinct().sorted().map(t -> t.toUpperCase()).forEach(t -> System.out.print(t + " "));
    }
    //2)Print the list elements on the console by ordering them according to their lengths, with upper cases, and un-repeatedly

    public static void printElementAccordingtolenghtsUpperUnrepeadetly(List<String> names) {
        names.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));

    }

    //3)Print the list elements on the console by ordering them according to their last characters, with upper cases, and un-repeatedly
    public static void printElementAccordingtolastsUpperUnrepeadetly(List<String> names) {
        names.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).forEach(ReverseUtil::inthesameline);
    }

    //4)Create a method to sort the elements according to their lengths then according to their first characters
    public static void printElementAccordingtolastsandfirst(List<String> names) {
        names.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(Utils::printInTheSameLineWithSpace);
    }

    //5)Create a method which takes the square of the length of every element, prints them distinctly in reverse order
    public static void takesquareoflenght(List<String> names) {
        names.
                stream().
                map(String::length).
                distinct().
                map(Utils::getSquare).
                sorted(Comparator.reverseOrder()).
                forEach(Utils::printInTheSameLineWithSpace);
    }



}
