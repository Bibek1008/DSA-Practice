package Stack;

public class Linkedlist_imp {
    static class Node{
        public int val;
        public Node next;
        Node(int val){
            this.val=val;
            next=null;
        }

    }
    static class Stack{
        Node head=null;
        void push(int data){
            Node temp=new Node(data);
            temp.next=head;
            head=temp;

        }
        void pop(){
            if(head==null){
                System.out.println("Not possible");
                return;
            }
            head=head.next;
        }
        void peek(){
            System.out.println(head.val);
        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }




    }



    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(32);
        s.push(34);
        s.display();
        System.out.println("this is preek");
        s.peek();
        s.push(5);
        s.display();
        s.pop();
        s.display();

    }
}
