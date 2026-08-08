public class Linked1{

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert at beginning
    void insertFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Display
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Linked1 list = new Linked1();

        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        list.display();
    }
}