package PracticesDemo;

import java.util.ArrayList;
import java.util.Collections;

public class main1 {
    public static void main(String[] args) {
        ArrayList<Employee1>al=new ArrayList<>();
        al.add(new Employee1(1,1000,2000));
        al.add(new Employee1(2,2000,2001));
        al.add(new Employee1(3,3000,2002));

        Collections.sort(al);
        for(Employee1 e:al){
            System.out.println(e.id+" "+e.salary+" "+e.year);
        }


    }
}
