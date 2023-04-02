package javaquestionbank;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

     LocalTime x=LocalTime.now();
        System.out.println(x);


        LocalDate myDob = LocalDate.of(1996, 8, 21);
        LocalDate myKidsDob = LocalDate.of(2015, 3, 12);
        long differenceInHours = ChronoUnit.HOURS.between(myDob, myKidsDob);
        System.out.println("The difference in hours is " + differenceInHours);


    }

}
