package practices.practice03nt;

public class Q01_Ternary {
 //Type code to check if a number is positive or not
 public static void main(String[] args) {
     //1.Way;
     int x=-23;

     if(x>0){
         System.out.println("Positive");

     }else{
         System.out.println("Negative");
     }

     //2.Way;

     String result=x>0 ? "Positive" :"Negative";
     System.out.println(result);

     //Example 2:Type code to check if an integer has 3 digits or not
     int y=234;
     int absY=Math.abs(y);
     String result2=absY>99 && absY<1000 ? "It has three digits" :"it does not have 3 digits";
     System.out.println(result2);







 }

}
