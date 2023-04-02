package ssg16PassByValue;

public class PassByValue03 {
    public static void main(String[] args) {
        int a[]={10};
        System.out.println("before add " + a[0]);
        add(a);
        System.out.println("after add " + a[0]);
    }
    // Creating A single Element Array & passing as A parameter in method

   public static void add(int a[]){
       a[0]++;
   }
}
