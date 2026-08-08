public class LinkedList2 {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete a node
    void delete(int data) {
        if (head == null) {
            return;
        }

        // If head needs to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        LinkedList2 list = new LinkedList2();

        // Insert elements
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Original Linked List:");
        list.display();

        // Insert at beginning
        list.insertAtBeginning(5);

        System.out.println("After inserting 5 at beginning:");
        list.display();

        // Delete
        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
    }
}