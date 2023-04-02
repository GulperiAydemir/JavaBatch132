package javaquestionbank;

public class Loop03 {
    public static void main(String[] args) {
        //Type code to check whether a String is palindrome or not. If a String is the same with its
        //reverse then it is called palindrome. For example; “anna”, “123321” are palindromes

        String name = "anna";
        String s = "";
        for (int i = name.length()-1; i > -1; i--) {
            String c = name.substring(i, i + 1);
            s = s + c;
        }
            if (name.equals(s)) {
                System.out.println("is palindrome");
            } else {
                System.out.println("is not palindrome");
            }

        }

    }

