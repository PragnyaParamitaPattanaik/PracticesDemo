package PracticesDemo;

public class MyCalculator {
    public long power(int n, int p) throws Exception{
        long result;
        if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
        result=(long)Math.pow(n,p);
        return result;
    }
}


