package practices.practise02;

public class QH05 {
    public static void main(String[] args) {
//1.Task: Count the alphanetical charaters in a given value.
        String str= "Wow!...Ali is 13 years old and he is a university student!!!";

        int strlenght =str.length();//60
        System.out.println(strlenght);
        str.replaceAll("\\p{Punct}","");
        String withoutNumber =str.replaceAll("[^a-zA-Z]","");

        System.out.println(withoutNumber);
        int alphnumb=withoutNumber.length();
        System.out.println(alphnumb);











    }
}
