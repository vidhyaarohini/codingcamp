class TreeNode1 {
    int val;
    TreeNode1 left, right;

    TreeNode1(int val) {
        this.val = val;
    }
}

public class BSTToGreaterSumTree {
    private int sum = 0;

    // Reverse in-order traversal: right → root → left
    public void convertToGST(TreeNode1 root) {
        if (root == null) return;

        convertToGST(root.right);
        sum += root.val;
        root.val = sum;
        convertToGST(root.left);
    }

    // In-order traversal to print the tree
    public void printInOrder(TreeNode1 root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        /*
            Original BST:
                    4
                   / \
                  1   6
                 / \   \
                0   2   7
                         \
                          8
        */

        TreeNode1 root = new TreeNode1(4);

        root.left = new TreeNode1(1);
        root.right = new TreeNode1(6);
        root.left.left = new TreeNode1(0);
        root.left.right = new TreeNode1(2);
        root.right.right = new TreeNode1(7);
        root.right.right.right = new TreeNode1(8);

        BSTToGreaterSumTree transformer = new BSTToGreaterSumTree();
        System.out.println("In-order before transformation:");
        transformer.printInOrder(root);

        transformer.convertToGST(root);

        System.out.println("\nIn-order after transformation:");
        transformer.printInOrder(root);
    }
}
