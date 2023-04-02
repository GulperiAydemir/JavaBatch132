package javaquestionbank;

public class Ternary01 {
    /*
    Use ternary to print "Valid Password" if the password has at least 8 characters different
from space characters. "Invalid Password" if the password has less than 8 characters
different from space character
     */
    public static void main(String[] args) {
        String password="12 hga.";
       String pwd=password.replaceAll(" ","").length()>7 ?"valid password"  :"invalid password";
      // String pwd= password.replaceAll("\\s","").length()>7 ? "Valid Password" : "Invalid Password";
        System.out.println(pwd);
    }
}
