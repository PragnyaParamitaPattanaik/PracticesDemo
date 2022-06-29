package InheritanceExa;

public class Example2{
    public static void main(String[]args){
        Bird bird=new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
 class Bird extends Animal{
    void walk() { System.out.println("I am walking");
     }

     public void fly() { System.out.println("I am flying");
     }

     public void sing() {System.out.println("I am singing");
     }
 }