package PracticeDemo90;

import java.util.ArrayList;
import java.util.Collections;

public class Simple {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Arnapur",6));
        al.add(new Student(102,"apur",4));
        al.add(new Student(103,"Arrun",8));
        System.out.println("Sorting by Age");
        Collections.sort(al,new AgeComparator());
        for(Student st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
