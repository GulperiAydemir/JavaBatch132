package b132practices.practice01;

public class Q06 {

    public static void main(String[] args) {
        //Type code to calculate sum of all whole number primitive data types' min and max values.

        //byte,short,integer,long
    byte minByte=Byte.MIN_VALUE;
    byte maxByte=Byte.MAX_VALUE;

    short minShort=Short.MIN_VALUE;
    short maxShort= Short.MAX_VALUE;

    int minInt=Integer.MIN_VALUE;
    int maxInt=Integer.MAX_VALUE;

    long minLong=Long.MIN_VALUE;
    long maxLong=Long.MAX_VALUE;

    double sum=minByte+maxByte+minShort+maxShort+minInt+maxInt+minLong+maxLong;
        System.out.println("sum = " + sum);

    }
}
