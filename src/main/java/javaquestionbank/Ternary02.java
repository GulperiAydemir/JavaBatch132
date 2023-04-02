package javaquestionbank;

public class Ternary02 {
    /*
    Use ternary to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
     */
    public static void main(String[] args) {
        int a=3, b=5, c=7;

        String typeOfTriangle = a==b && b==c ? "Equilateral Triangle" : (a==b && b!=c || a==c && b!=c ||
                b==c && a!=c ? "Isosceles Triangle" : "Neither isosceles, nor equilateral");
        System.out.println(typeOfTriangle);
    }
}
