package LinkedList;

public class Intro {
    static  void printR(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printR(head.next);
    }
    static void print(Node temp){
        Node b=temp;
        while (b!=null){
            System.out.print(b.data+" ");
            b=b.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }

    public static void main(String[] args) {


      Node a=new Node(5);
      Node b=new Node(9);
      Node c=new Node(7);
      Node d=new Node(2);
      Node e=new Node(9);
      a.next=b;
      b.next=c;
      c.next=d;
      d.next=e;
      e.next=null;
//      System.out.println(a.data);
//      System.out.println(a.next.data);
//      System.out.println(a.next.next.data);
//      System.out.println(a.next.next.next.data);
//      System.out.println(a.next.next.next.next.data);
        Node temp=a;
        for(int i=0;i<5;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        temp=a;
        System.out.println("\nUsing while loop");
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        temp=a;
        System.out.println("\nPrinting using function ");
        print(temp);
        System.out.println("using recursion ");
        printR(temp);






    }




}
