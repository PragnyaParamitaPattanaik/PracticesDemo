package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main (String[]args){
        Employee e1=new Employee(1,"Ram");
        Employee e2=new Employee(2,"Sham");
        Employee e3=new Employee(3,"Raghu");
        Employee e4=new Employee(4,"Dham");
        List<Employee> empList= Arrays.asList(e1,e2,e3,e4);
        List<Integer> intList=Arrays.asList(1,2,3,4,5);
        intList.stream().filter(i->i%2==0).map(i->i+i);
        empList.stream().filter(e->e.getId()%2==0).map(e->{
            e.printName();
            return e.getName();
        }).forEach(e->System.out.println("AT  LAST"+e));

    }
}
class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void printName(){
        System.out.println("In Employee class"+name);
    }

}
