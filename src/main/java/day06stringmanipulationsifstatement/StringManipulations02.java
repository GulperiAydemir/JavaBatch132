package day06stringmanipulationsifstatement;

public class StringManipulations02 {

    public static void main(String[] args) {
        //Example 1:Type Code to check if a given String is empty or not
        //Java ==>false  - ""==>.
        String s ="Java";

        //1.Way :used lenght();
        boolean r1=s.length()==0;
        System.out.println("is the given String empty ? "+ r1);

        //2.Way:Recommended bcause if Java has a method for a specific task we always prefer to use it
        boolean r2=s.isEmpty();
        System.out.println("is the given String empty ? "+ r2);


        //Exapmle 2:Type Code to check if a given String is containing just "space character" or not
        //          " "==>  -  "a       b "==>false

        String t =" a ";
          //1.Way
        boolean r3=t.replaceAll("[ ]","").length()==0;
        System.out.println("is it containing just space character?" +r3);

        //2.Way:checks if the String has any character diffrent from space
        boolean r4=t.isBlank();
        System.out.println("is it containing just space character?" +r4);

        //Example 3 :Type code to join multiple Strings
        //"Parkland" -"Miami "- "USA"==>parklandMiamiUSA
        String u1="Parkland";
        String u2="Miami";
        String u3="USA";

        String result1=u1+u2+u3;
        System.out.println(result1);//ParklandMiamiUSA==>parklandMiamiUSA

        //2.Way

        String result2 = u1.concat(u2).concat(u3);
        System.out.println(result2);//ParklandMiamiUSA


    }
}
