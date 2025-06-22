package LinkedList;

public class NthfromLast {


    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // Inserts a new node with the given value at the end of the list.
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        // Displays the contents of the list.
        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        int deletenode(int n){
            Node fast=head;
            Node slow=head;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow.data;

        }
        void deletenodeFromlast(int n){
            Node fast=head;
            Node slow=head;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            if(fast==null){
                head=head.next;return;
            }
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;


        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating a linked list with 5 nodes
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        // Displaying the list: Expected Output: 10 20 30 40 50
        list.display();
        System.out.println(list.deletenode(2));
        list.deletenodeFromlast(5);
        list.display();
    }






}
