package day03nonprimitivescannerclass;

public class NonPrimitives01 {
    public static void main(String[] args) {

        /*
        What are the differences between "Primitive" and "Non-Primitive" data types?
        1."Non-Primitive " data is stored in Heap Memory ,"Primitve  data is stored in Stack Memory
        2."Non-Primitive " data types are infinetely many ,but "Primitive" data types are just 8
        3."Non-Primitive " data types can be created by Java and Java Developers,but  "Primitive" data types can be created just by Java
        4."Non-Primitive " data types names start with upper-cases, Java Developers, "Primitive" data type names  use just lower-cases
        *5.Main Difference "Non-Primitive " data types " have i)Value and ii)Methods in them
        "Primitive" data types have i)Value

         */
        /*
        1.When you create a String, Java will check "String Pool" first ,if the value you assigned to the String exists
        in the "String Pool ",Java will not create a new container ,Java will use existing container

        But if the "String Pool" does not have the value you assigned,Java will create a new container.

        2.Sometimes we may need a different container even the values are same.How can we do it?




         */

        String stdName="Tom Hanks";
        String teacherName="Tom Hanks";
        String parentName=new String ("Tom Hanks");






    }

}
