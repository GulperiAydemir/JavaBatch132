package day23encapsulationabstraction;

public abstract class Animal {

/*
1)Sometimes we don't need  method body ,that is why we should not type it.
If we do not type the "body part" the method will be "method without body " it is abstract method"
2)other name of the "regular methods" is concrete method", it means "method with body"
3)"Concrete method"s focus on "How to do", "Abstract method's " focus on "What to do"
4)When you create an "Abstract method's" in parent class ,the functionality will be mandatory for the child classes.
5)If a functionalty is not mandatory do not make it abstract make it concrete
6)To make a method abstract i)Remove method body ii)Use abstract keyword between "access modofier" and "returm type"
  iii)Chane the concrete class" to abstract class" bu using abstract keyword between "access modofier" and "classs" keyword
Note:After creating  on abstract method  do not forget to use them in all "concrete" child classes.
If you do not use them  in all "concrete" child classes, you will get error/

7)Implementing abtsract methods from parent class to "abstract child classes " is optional
if you need implement it, if you not need, do not implement it
8)You can use " concrete method " and "abstract methods"
9)"Final" method must have "constant method body" but in asbtraction every child class will use the "abstract method" with a different body
 Because of that ,Java does not let you make an abstract method "Final"
 10)An "abstract class " can not "final" because ; final class cannot have child classes but abstract class should have child classes
 to make "abstract method"s to be implemented in child classes.
 11)Abstract classes can have "abstract methods","abstract methods" are "uncompleted methods" because they do not have body part
 if you create an object from an abstract class" the object will have missing parts/
 I mean the object will not be perfect ,if an object is not perfect it can create issues in the application
 Because of that Java does not let you create object from an obstract class
 12)"abstract classes are classes, so they have "constructor" like other classes but the constuctor cannot create object
 13)We create abstract method" for the child classes to use ,but if you make the access modifier "private" it means
 you do not want child classes to use it.This is contradicition,that is why Java does not let make an abstract method"privite"
 14)An abstract method can not be "static",
 15)Same rule in Overriding are valid for implementing abstract methods.
 */

    public abstract void eat();

    public void play(){
        System.out.println("Animal play...");
    }



    }


