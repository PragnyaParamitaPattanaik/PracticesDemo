package PracticesDemo;

public class StringExample {
    public static void main(String[]args){
        String A="madam";
        System.out.println(A.equals(new StringBuilder(A).reverse().toString())?"Yes" :"No");
                
                
    }
}
