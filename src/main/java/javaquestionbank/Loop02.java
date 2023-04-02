package javaquestionbank;

public class Loop02 {
    public static void main(String[] args) {
        /*
Type code to print repeated characters in a String. For example; accessories ⇒ ces
         */

        //1.way
        String name="accessories";
        String s="";
        for(int i=0; i<name.length();i++){
            String a=name.substring(i,i+1);
            if(name.indexOf(a)!=name.lastIndexOf(a)){
                if(!s.contains(a))
               s=s+a;
            }

        }
        System.out.println(s);
    }
}
