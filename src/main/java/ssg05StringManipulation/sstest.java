package ssg05StringManipulation;

public class sstest {
    public static void main(String[] args) {
        String name1="Gulperi Aydemir";
        String name2="Elvira Be6";

        String a=name1.replaceAll("\\s","*");//Gulperi*Aydemir
        System.out.println(a);
        int a1=name1.replaceAll("\\s","").length();//14
        System.out.println(a1);//14
        int b1=name2.replaceAll("\\S","").length();//1
        String b2=name2.replaceAll("\\S","");//
        String b3=name2.replaceAll("\\S","*");//****** ***
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);//****** ***

        // Not:("\\s")==>Bosluk space karakteri demek
        //("\\S") Bosluk disindaki karakterler demek

    }
}
