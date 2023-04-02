package day06stringmanipulationsifstatement;

public class StringManipulations03 {

    public static void main(String[] args) {

        //Example 1:Type code to check if given String contains a specific character or characters
        //  "New York"==>w-->true    - York -->true      - Xxx-->

        String s="New York";

        boolean r1=s.contains("Xxx");
        System.out.println("Is it containing the given character? "+ r1);

       //Example 2 = Type code to change the first occurance of "Java" to "pyhton"
        //Java is Java , I like Java ==>pyhton is Java , I like java
        String t="Java is Java , I would like Java ";
        String updatedT=t.replaceFirst("Java", "Phtyon");
        System.out.println(updatedT);//Phtyon is Java , I would like Java

        //Example 3= Type code to repeat a given String
        // "Java" 4 times ==>JavaJavaJavaJava

        String u="Java";
        // 1.Way
        String u1=u+u+u+u;
        System.out.println(u1);

        // 2.Way

        String u2=u.concat(u).concat(u).concat(u);
        System.out.println(u2);

        // 3.Way
         String u3=u.repeat(4);
        System.out.println(u3);





    }
}
