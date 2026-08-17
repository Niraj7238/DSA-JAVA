package LinkedList;

public class CycleDetection {

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

    // cycle detection --> ("floyds cycle finding algorithm")

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                return  true; // cycle exixts
            }
        }
        return  false; // cycle does not exist
    }




    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1->2->3->1
        System.out.println(isCycle());
    }
}