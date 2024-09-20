package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> al =Arrays.asList(2,1,3,12,5,7,4,6,9,87,8,6,56,45,34);
        System.out.println(al);
        //**********  Find out the even nos and stored in new list **************

        //-------------without using stream api-------------
        List<Integer> al2=new ArrayList<>();

        for (Integer a : al) {
            if (a % 2 == 0) {
                al2.add(a);
            }
        }
        System.out.println(al2);


        //--------------------Using stream api--------------------------

        List<Integer> list=  al.stream().filter(a->a%2==0).collect(Collectors.toList());

        System.out.println(list);
    }



}
