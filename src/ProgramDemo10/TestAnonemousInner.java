package ProgramDemo10;
abstract  class Person {
    abstract void eat();

}
public class TestAnonemousInner {
    public static void main(String[]args){
        Person p=new Person() {
            void eat() {
                System.out.println("Yummy fruits");
            }
        };
        p.eat();
    }
}
