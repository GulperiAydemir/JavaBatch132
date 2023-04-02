package ssg16PassByValue;

public class PassByValue02 {
    public static void main(String[] args) {

       String question="What is your level in Java";
        String newQuestion= question.concat("?");
        System.out.println(newQuestion);
        addQuestionMark(question);





    }

    public static String  addQuestionMark(String str){

        return str+ "?";

    }

}
