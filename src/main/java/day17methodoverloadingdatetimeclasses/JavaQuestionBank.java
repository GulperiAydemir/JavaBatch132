package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class JavaQuestionBank {
    public static void main(String[] args) {

        //Example:Type the code that finds out how many days Ali lived.
        //Date of birth of Ali is 12th of May 2002
        LocalDate aliBirthDay=LocalDate.of(2002,5,12);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        long alinowAge= ChronoUnit.DAYS.between(aliBirthDay,currentDate);
        System.out.println(alinowAge);
    }
}
