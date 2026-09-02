public class mirrorProblem {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Mirror
    public static Node mirror(Node root) {

        if (root == null) {
            return null;
        }

        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    // Print - Preorder
    public static void printTree(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(12);

        System.out.println("Original Tree:");
        printTree(root);

        mirror(root);

        System.out.println("\nMirror Tree:");
        printTree(root);
    }
}