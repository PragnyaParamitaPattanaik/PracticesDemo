package ProgramDemo10;


import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class Example33 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        System.out.println("List:"+list);
        list.remove(1);
        System.out.println("After remove(1), List:"+list);
    }
}
