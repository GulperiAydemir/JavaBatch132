package javaquestionbank;

public class Ternary05 {
    /*
    Type code to check the password
If it has more than 8 characters, initial should be 'i'
If it does not have more than 8 characters initial should be 'K'
Solve the task by using nested-ternary
     */
    public static void main(String[] args) {
        String p = "i234gh";
        String checkpwd = p.length() > 7 ? p.charAt(0) == 'i' ? "Valid" : "invalid" : p.charAt(0) == 'K' ? "Valid" : "invalid";
        System.out.println(checkpwd);
    }
}
