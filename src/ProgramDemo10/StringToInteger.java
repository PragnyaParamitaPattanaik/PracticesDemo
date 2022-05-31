package ProgramDemo10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringToInteger {
    public static void main(String[] args) {
        //Creating Set of String
        Set<String> setOfString=new HashSet<>(Arrays.asList("1","2","3","4","5"));
        //printing Set of String
        System.out.println("Set of String:"+setOfString);
        //Converting set of String to Set of Integer
        Set<Integer> setOfInteger=setOfString.stream().map(s->Integer.parseInt(s)).collect(Collectors.toSet());
        System.out.println("Set of Integer:"+setOfInteger);

    }
}
