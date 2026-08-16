package LinkedList;

public class addLast {

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
    public static int size;

    // Add Last
    public void addLasts(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Print Linked List
    public void print() {

        if (head == null) {
            System.out.println("null");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Add in Middle
    public void add(int idx, int data) {

        if (idx == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = newNode;
            }

            size++;
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        int i = 0;

        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Invalid Index");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }

        size++;
    }

    // Remove First
    public int removeFirst() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        head = head.next;
        size--;

        if (size == 0) {
            tail = null;
        }

        return val;
    }

    // Remove Last
    public int removeLast() {

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        // Only one node
        if (size == 1) {

            int val = head.data;

            head = tail = null;
            size = 0;

            return val;
        }

        // Find previous node of tail
        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;

        prev.next = null;
        tail = prev;

        size--;

        return val;
    }

    // Search (iterative)
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return  -1;

    }

    //recusive Search

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }


    // Main
    public static void main(String[] args) {

        addLast ll = new addLast();

        ll.print();

        ll.addLasts(1);
        ll.print();

        ll.addLasts(2);
        ll.print();

        ll.addLasts(3);
        ll.print();

        ll.addLasts(4);
        ll.print();

        ll.add(2, 9);
        ll.print();

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));




    }
}