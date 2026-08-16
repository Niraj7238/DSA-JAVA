package LinkedList;

public class addFirst {

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

    // Add First
    public void addfirsts(int data) {

        // Step 1: Create new node
        Node newNode = new Node(data);

        // If LinkedList is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: New node points to head
        newNode.next = head;

        // Step 3: Head becomes new node
        head = newNode;
    }

    // Print LinkedList
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        addFirst ll = new addFirst();

        ll.addfirsts(1);
        ll.addfirsts(2);
        ll.addfirsts(3);

        ll.print();
    }
}