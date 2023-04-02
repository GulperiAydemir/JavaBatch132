package javaquestionbank;

public class Loop04 {
    //Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
    public static void main(String[] args) {

        String n="22389";
        String s="";

        for(int i=0;i<n.length();i++){
            String c=n.substring(i,i+1);

            if(n.indexOf(c)!=n.lastIndexOf(c)){
                s=s+c;
            }
        }
        System.out.println(s);
    }
}
