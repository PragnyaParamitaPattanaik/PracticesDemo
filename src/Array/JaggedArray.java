package Array;

public class JaggedArray {
    public static void main(String[] args) {
        Integer[] a1 ={1,2,3};
        Integer[] a2 ={1,2,3,4};
        Integer[] a3 ={1,2,3,4,5};
        Integer[][] a ={a1,a2,a3};
        System.out.println("Jagged Array");
        for (Integer[] integers : a) {
            for (Integer integer : integers) {
                System.out.println(integer + "");
            }
            System.out.println("\n");
        }
    }
}
