package PracticesDemo;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand=new Random();
        int upperbound=25;
        int random_number=rand.nextInt(upperbound);
        double double_number=rand.nextDouble();
        float float_number=rand.nextFloat();
        System.out.println("Random Integer value from 0 to +(upperbound-1)+:"+random_number);
        System.out.println("Random double value from 0.0 and 1.0:"+double_number);
        System.out.println("Random float value from 0.0 and 1.0:"+float_number);


    }
}
