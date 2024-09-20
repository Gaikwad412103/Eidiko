package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        //----------Using foreach loop iterate the arraylist element (Lambda Expression)------------

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,342,23,3,52,523,56,4));
        //list.forEach(a-> System.out.print(a+" "));
        list.forEach(System.out::println);

    }
}
