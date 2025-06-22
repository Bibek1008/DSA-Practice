package LinkedList;

public class Implementation {

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

        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void display() {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " ");
                p = p.next;
            }
            System.out.println();
        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtIndex(int val, int index) {
            if (index < 0 || index > size()) {
                System.out.println("Not possible");
                return;
            }
            if (index == 0) {
                insertAtBeginning(val);
                return;
            }
            if (index == size()) {
                insertAtEnd(val);
                return;
            }

            Node temp = new Node(val);
            Node current = head;
            // Traverse to the node just before the desired index
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            temp.next = current.next;
            current.next = temp;
        }
        int get(int index){
            if(index<0||index>size()){
                System.out.println("wrong index");
                return -1;
            }
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int index){
            if(index==0){
                head=head.next;
                if(head==null){
                    tail=null;
                }
                return;
            }
            Node temp=head;
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }

            temp.next=temp.next.next;
            tail=temp;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(9);
        list.insertAtEnd(4);
        list.insertAtEnd(7);
        list.insertAtEnd(10);
        list.display();          // Output: 9 4 7 10
        System.out.println(list.size());  // Output: 4

        list.insertAtBeginning(23);
        list.display();          // Output: 23 9 4 7 10

        list.insertAtIndex(30, 2);  // Insert 30 at index 2
        list.display();          // Expected Output: 23 9 30 4 7 10

        System.out.println(list.get(-9));
        list.deleteAt(2);
        list.display();
    }
}
