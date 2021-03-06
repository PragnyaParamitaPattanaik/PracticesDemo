package ProgramDemo10;

public class BinarySearchexample {
    public static int binarySearch(int[] arr, int first, int last, int key) {

        if (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, first, mid - 1, key);//search in left subarray
            } else {
                return binarySearch(arr, mid + 1, last, key);//search in right subarray
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[] arr ={20,30,40,50,60};
        int key=30;
        int last=arr.length-1;
        int result=binarySearch(arr,0,last,key);
        if(result==-1) {
            System.out.println("Element not found!");
        } else
                System.out.println("Element  found at the index!"+result);


       }


    }


