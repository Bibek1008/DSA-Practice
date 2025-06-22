package Array;
import java.util.*;
public class Targetsum {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num=sc.nextInt();
        int []arr=new int[num];

        for (int i=0;i< arr.length;i++){
            System.out.println("Enter element "+i+1+" in array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int x=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++) {
                for (int k = j + 1; k < arr.length; k++) {


                if (arr[i] + arr[j] +arr[k]== target) {
                    x++;
                }
            }
            }
        }
        System.out.println("The number of triplets are "+x);
    }
}
