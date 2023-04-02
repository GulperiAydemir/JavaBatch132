package javaquestionbank;

public class Ternary {
    public static void main(String[] args) {


        //Use ternary to print
        //a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        //b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        //c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

        int x=5,y=3,z=5;

        String xyz= x==y&& y==z && z==x?"Equilateral Triangle " :(x==y && y!=z|| x==z && y!=z|| y==z&& x!=z ? "isosceles Triangle" :"Neither iss");


        int a = 5, b = 4, c = 3;
        String typeOfTriangle = a==b && b==c ? "Equilateral Triangle" : (a==b && b!=c || a==c && b!=c ||
                b==c && a!=c ? "Isosceles Triangle" : "Neither isosceles, nor equilateral");
        System.out.println(typeOfTriangle);


    }
}
