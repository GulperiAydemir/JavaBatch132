package ssg14listArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OwnStudy {
    public static void main(String[] args) {

        List<Integer> num=new ArrayList<>();
        num.add(12);
        num.add(23);
        num.add(7);
        num.add(11);
        num.add(35); // 12,13


        for (int i = 0; i <num.size() ; i++) {
            int element=num.get(i);
            if(element==7){
                continue;
            }
            num.set(i,element+3);
        }
        System.out.println(num);
        }
    }




