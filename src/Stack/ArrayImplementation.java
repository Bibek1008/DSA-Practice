package Stack;

public class ArrayImplementation {

    static class Stack{
        static int top=-1;
        static int arr[]=new int[5];
        void underflow(){
            if(top<0){
                System.out.println("underflow");
                return;
            }
        }
        void overflow(){
            if(top>=arr.length-1){
                System.out.println("overflow");
                return;
            }
        }
        void push(int x){
            overflow();
            arr[++top]=x;

        }
        void pop(){
            underflow();
            int x=arr[top--];
        }
        void peek(){
            underflow();
            System.out.println(arr[top]);

        }
        static void display(){
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }



    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(45);
        st.display();
    }
}
