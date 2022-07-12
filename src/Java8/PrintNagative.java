package Java8;

import java.util.ArrayList;
import java.util.List;

public class PrintNagative {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(-5);
        list.add(0);
        list.add(5);
        list.removeIf(n -> (n < 0));

        list.forEach(System.out::println);
    }
}
