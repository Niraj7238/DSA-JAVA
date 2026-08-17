package LinkedList;

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
        // Slow-fast Approach  helper function
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return  slow; // slow is my mid nodess
    }


    public boolean checkPalidrome(){
        if(head == null || head.next == null){
            return  true;
        }
        // step1 -- find mid
        Node midNode = findMid(head);


        // step2-- reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right head node
        Node left = head;

        // step3- check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }







    public static void main(String[] args) {

        removeNth_NodeFrom_End ll = new removeNth_NodeFrom_End();

        // Add 10 nodes
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); // 1->2->2->1
        System.out.println(ll.checkPalidrome());
    }
}