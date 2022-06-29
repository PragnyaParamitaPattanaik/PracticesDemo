package InheritanceEx2;

public class Example2 {
    public static void main(String[] args){
        //Create a new Adder object
        Adder a=new Adder();
        //print the name of superclass
        System.out.println(a.getClass().getName() + "My Superclass is :");
        //Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}


class Arithmatic{
    public int add(int a,int b){
        int Sum=a+b;
        return Sum;
    }
}
class Adder extends Arithmatic{
    public int callAdd(int a,int b){
        return add(a,b);
    }
}

