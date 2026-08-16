package LinkedList;

public class ReverseLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add Last
    public void addLasts(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print Linked List
    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
 // reverse the linklist

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }




    public static void main(String[] args) {

        ReverseLinkedList ll = new ReverseLinkedList();

        ll.addLasts(1);
        ll.addLasts(2);
        ll.addLasts(3);
        ll.addLasts(4);
        ll.addLasts(5);

        System.out.println("Original Linked List:");
        ll.print();

        ll.reverse();
        ll.print();


    }
}