package ProgramDemo10;

import java.util.Scanner;

public class Practice23 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println((A.length()<B.length()?"Yes":"No"));
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1, B.length()));
    }
}

