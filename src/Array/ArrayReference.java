package Array;
import java.util.Arrays;

public class ArrayReference {

    static void change(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }

    static void printf(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={2,4,6,7};
        System.out.println("The orginal array is ");
        printf(arr);
//        int []arr_2=arr;
//        arr_2[0]=0;
//        arr_2[1]=0;
//        System.out.println("\nThe copied array is");
//        printf(arr_2);
//        System.out.println("\nAfter changing array 2");
//        printf(arr_2);
//        System.out.println("\nAfter changing array 1");
//        printf(arr);
//        change(arr);
//        System.out.println("\nAfter changing from function");
//        printf(arr);
        //deep copy
        int x[]=arr.clone();
        int y[]=Arrays.copyOf(arr,arr.length);
        System.out.println("Copied array");
        printf(x);
        change(x);
        System.out.println("Array after changes");
        System.out.println("orginal array");
        printf(arr);
        System.out.println("copied array");
        printf(x);
        System.out.println("Array using copyOf method");
        printf(y);
        int z[]=Arrays.copyOfRange(arr,1,4);
        System.out.println("The Z array is");
        printf(z);



    }
}
