package ssgloop;

public class Loop03 {

    public static void main(String[] args) {
        System.out.println(seresSum(5));
    }
    public static long seresSum(int n){
        long sum=0;
        for(long i=1; i<=n; i++){
            sum+=i;
        }
     return sum;
    }
}
