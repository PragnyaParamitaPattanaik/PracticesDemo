package Array;

public class Generics {
    public static void main(String[] args)
    {
        Integer[] int_Array={1,2,3,4,5};
        Character[] char_Array={'J','A','V','A'};
        System.out.println("Integer Array Contents");
        printGenericArray(int_Array);
        System.out.println("Character Array Contents");
        printGenericArray(char_Array);


    }
    public static< T >void printGenericArray(T[]items){
        for(T item:items){
            System.out.println(item+"");

        }

    }
}
