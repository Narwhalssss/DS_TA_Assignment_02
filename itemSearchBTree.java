public class itemSearchBTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int nodeCount = tree.countNodes();
        System.out.println("Number of nodes in the binary tree: " + nodeCount);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }
    private int countNodes(Node node) {
        if (node == null)
            return 0;

        int leftCount = countNodes(node.left);
        int rightCount = countNodes(node.right);

        return 1 + leftCount + rightCount;
    }
    public int countNodes() {
        return countNodes(root);
    }
}
