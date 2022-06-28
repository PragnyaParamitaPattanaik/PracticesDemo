package PracticeDemo90;

import java.util.ArrayDeque;
import java.util.Deque;

public class example78 {
    public static void main(String[]args)
    {
        Deque<String> deque= new ArrayDeque<>();
        deque.add("Ram");
        deque.add("Shyam");
        for(String str:deque){
            System.out.println(str);
        }

    }
}
