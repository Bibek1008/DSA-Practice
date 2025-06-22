package Array;




class Max{
    void element(){
        int []arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }

        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum is "+max);
    }
}
public class MaximumofArray {
    public static void main(String[] args) {
        Max x=new Max();
        x.element();
    }
}
