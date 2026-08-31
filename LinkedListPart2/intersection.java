public class intersection{
    // Node class 
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }



    // main logic of ----> intersection

    public static ListNode getIntersection(ListNode headA, ListNode headB){
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2){
            if(p1 == null){
                p1 = headA;
            }
            else{
                p1 = p1.next;
            }
            if(p2 == null){
                p2 = headA;
            }
            else{
                p2 = p2.next;
            }

        }
        return p1;

    }

    public static void main(String[] args) {

        // Common part
        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);

        c1.next = c2;
        c2.next = c3;

        // List A
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);

        a1.next = a2;
        a2.next = c1;

        // List B
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);

        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        // Find intersection
        ListNode result = getIntersection(a1, b1);

        if (result != null) {
            System.out.println("Intersection Node: " + result.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}