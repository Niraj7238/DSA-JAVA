package LinkedList;

public class RemoveLooporCycle {

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

        // function for remove the cycle form the linkedlist
    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // finding mitting point
        // finding mitting point
        slow = head;
        Node prev = null; // last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -- last.next = null
        prev.next = null;

    }


    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        // 1->2->3->2
        removeCycle();

    }
}