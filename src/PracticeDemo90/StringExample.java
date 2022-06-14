package PracticeDemo90;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        String s = new String("He is a very very good boy, isn't he?");
        if (s.length() > 0)
        {
            String[] tokens = s.split("\\s");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }

        }
        else{
            System.out.println(0);

        }


        }
    }

