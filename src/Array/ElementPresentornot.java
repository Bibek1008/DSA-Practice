package Array;
import java.util.*;
class Present{
    int presents(int x){

        int []arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=i+3;

        }
        for (int i=0;i<5;i++){
            if(x==arr[i]){
                return i+1;
            }
        }
        return -1;


    }
}
public class ElementPresentornot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value what you want to search");
        int num=sc.nextInt();

        Present obj=new Present();
        System.out.println(obj.presents(num));

    }
}
