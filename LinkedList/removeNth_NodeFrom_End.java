// package LinkedList;

public class removeNth_NodeFrom_End {

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
    public void addLast(int data) {

        Node newNode = new Node(data);

        // If Linked List is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Add at last
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

    public void deletNth(int n) {

        // Calculate size
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // If deleting head
        if (n == sz) {
            head = head.next;
            return;
        }

        // Find previous node
        int i = 1;
        int iTOFind = sz - n;

        Node prev = head;

        while (i < iTOFind) {
            prev = prev.next;
            i++;
        }

        // Delete Nth node from end
        prev.next = prev.next.next;
    }


    public static void main(String[] args) {

        removeNth_NodeFrom_End ll = new removeNth_NodeFrom_End();

        // Add 10 nodes
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        // Print
        ll.print();
        ll.deletNth(3);
        ll.print();
    }
}