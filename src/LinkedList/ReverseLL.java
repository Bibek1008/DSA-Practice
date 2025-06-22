package LinkedList;

public class ReverseLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static class LinkedList {
        Node head;
        Node tail;

        // Insert a node at the end of the list.
        void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Display the linked list.
        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        void reverse(){
            Node temp=head;
            Node rev=head;
            while(temp!=null){
                rev=temp.next.next;
                temp.next.next=temp;
            }
        }

        void displayRecursion(Node temp){
            if(temp==null){
                return ;
            }
            displayRecursion(temp.next);
            System.out.print(temp.data+" ");

        }
        Node reverserecursion(Node head){
            //base case
            if(head.next==null){
                return head;
            }
            Node newHead=reverserecursion(head.next);
            //self work
            head.next.next=head;
            head.next=null;

            return newHead;

        }
        void reverseIterative() {
            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node nextTemp = curr.next; // Save next node.
                curr.next = prev;          // Reverse the pointer.
                prev = curr;               // Move prev to current.
                curr = nextTemp;           // Move to next node.
            }
            head = prev; // Update head to the new front of the list.
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating a linked list with 5 nodes.
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        // Displaying the list. Expected output: 10 20 30 40 50
        list.display();

//        list.displayRecursion(list.head);
        list.head=list.reverserecursion(list.head);
        list.display();
        list.reverseIterative();
        list.display();


    }
}
