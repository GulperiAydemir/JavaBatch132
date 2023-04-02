package day17methodoverloadingdatetimeclasses;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
  //Type code to get current date

        Date currentDate=new Date();
        System.out.println(currentDate);//Wed Jan 25 01:59:04 GMT 2023

        System.out.println(currentDate.getTime());//1674612247138code
        //Type code to get current time in your local area
        LocalTime myTime= LocalTime.now();
        System.out.println(myTime);//02:09:50.124446==>Current time==>Hours:Mnutes:Seconds:NanoSeconds

        //Type code to get current date in your local area
        LocalDate myDate=LocalDate.now();
        System.out.println(myDate);//2023-01-25

        //Type code to get current date and current time in your local area
        LocalDateTime myDateTime=LocalDateTime.now();
        System.out.println(myDateTime);//2023-01-25T02:15:27.985179100

        //How to get a specific component from date and time

        System.out.println( myDate.getMonthValue());//1
        System.out.println(myDate.getMonth());//JANUARY
        System.out.println(myDateTime.getDayOfWeek());//WEDNESDAY

        //How to get time in another time zone
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-25T11:24:15.447935600
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul")));//2023-01-25T05:25:15.420743400
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Sofia")));//2023-01-25T04:26:23.741403
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/London")));//2023-01-25T02:27:21.809683100
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Baku")));//2023-01-25T06:27:21.810700600


         //How to go future or past in date and time
 System.out.println(myDate.plusYears(3).plusMonths(4).plusMonths(12));//2027-05-25

 System.out.println(myTime.minusHours(3).minusHours(20));//03:30:50.155442300





        //How to compare two dates

        LocalDate firstKidDob=LocalDate.of(2005,8,23);
        LocalDate secondKidDob=LocalDate.of(2011,3,11);

        boolean isFirstAfter=firstKidDob.isAfter(secondKidDob);
        System.out.println("isFirstAfter = " + isFirstAfter);//false

        boolean isFirstBefore=firstKidDob.isBefore(secondKidDob);
        System.out.println("isFirstBefore = " + isFirstBefore);//true

        boolean isFirstKidEqualsToSecondKid=firstKidDob.isEqual(secondKidDob);
        System.out.println("isFirstEqualsToSecondKid = " + isFirstKidEqualsToSecondKid);//false
        
        //How to format Date

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd:MMMM:yyyy");
        
        //d-->1,2,3....12,13,...31
        //dd-->01,02,03....12,13,...31
        //M-->1,2,3,....,10,11,12
        //MM-->01,02,03,....,10,11,12
        //MMM-->Jan,Feb,Mar,Apr....,Dec
        //MMMM-->January,February,Marc,April....,December
        //yy-->23
        //yyyy-->2023
        
        String formattedMyDate=dtf.format(myDate);
        System.out.println("formattedMyDate = " + formattedMyDate);//25:01:2023

        //How to format Date
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm a");

        //HH-->24 hours system
        //HH-->12 hours system
        //After time pattern leave a space put "a" it puts AM or PM next to the time



        String formattedTime=dtf2.format(myTime);
        System.out.println("formattedTime = " + formattedTime);//02:56



    }
}
