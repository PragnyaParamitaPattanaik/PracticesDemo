package Java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        //creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer>square= numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
        //creating a list of string
        List<String>names=Arrays.asList("Lorenzo","Lopita","Loma");
        List<String>result=names.stream().filter(s->s.startsWith("L")).collect(Collectors.toList());
        System.out.println(result);
        List<Integer>number=Arrays.asList(2,4,5,6,1);
        int even=number.stream().filter(x->x%2==0).reduce(0, Integer::sum);
        System.out.println(number);
        System.out.println(even);

        }
    }


