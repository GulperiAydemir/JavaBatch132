package javaquestionbank;

public class StringManipulations4 {
    public static void main(String[] args) {
        //Type code to get initials of the first name and the last name of a given name. Middle name
        //is out of scope.
        //Example: Tom Hanks ==> TH, Mary Star ==> MS

        String name="Tom Hanks";
        char fC=name.charAt(0);
        char lC=name.split(" ")[1].charAt(0);
        System.out.println(fC+ "-"+lC);

        String f=name.substring(0,1);
        int l=name.indexOf(" ")+1;
        String ls=name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);
        System.out.println(f+""+ls);

        /*
        Type a code to find the number of punctuation marks used in a String.
        String s = "Wow! Ali is 13 years old, but he is a university student.";

         */
        String s = "Wow! Ali is 13 years old, but he is a university student.";
        int slenght=s.length();
        int newss=s.replaceAll("[\\p{Punct}]","").length();
        System.out.println(slenght-newss);





    }
}
