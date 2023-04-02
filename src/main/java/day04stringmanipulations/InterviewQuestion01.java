package day04stringmanipulations;

public class InterviewQuestion01 {


    public static void main(String[] args) {

        //Example 1 :Type to swap the integers

        //a=12 and b =5 ==> a=5 and b=12

        //1.way:By using 3rd variable...

        int a=12;
        int b=5;
        int box=0;
        System.out.println(a+" "+ b);
        box=a;
        a=b;
        b=box;
        System.out.println(a+" "+ b);

        //2.way :Do not create 3rd varibale

        int x=12;
        int y=5;
        System.out.println(x+" - "+y);
         x=x+y;
         y=x-y;
         x=x-y;
        System.out.println(x+" - "+y);






    }
}
