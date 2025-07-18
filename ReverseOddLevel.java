import java.util.LinkedList;
import java.util.Queue;

class TreeNode2 {
    int val;
    TreeNode2 left, right;

    TreeNode2(int val) {
        this.val = val;
    }
}

public class ReverseOddLevel {
    public void reverse(TreeNode2 left, TreeNode2 right, int level) {
        if (left == null || right == null) return;

        if (level % 2 == 1) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        reverse(left.left, right.right, level + 1);
        reverse(left.right, right.left, level + 1);
    }

    public TreeNode2 reverseOddLevels(TreeNode2 root) {
        if (root == null) return null;
        reverse(root.left, root.right, 1);
        return root;
    }

    public void printLevelOrder(TreeNode2 root) {
        if (root == null) return;
        Queue<TreeNode2> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode2 node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public static void main(String[] args) {
        /*
            Original Tree:
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7

            After reversing odd levels:
                    1
                   / \
                  3   2
                 / \ / \
                4  5 6  7
        */
//(23);
//        TreeNodes nodes2 = new TreeNodes(8);
//        TreeNodes nodes3 = new TreeNodes(21);
//        TreeNodes nodes4 = new TreeNodes(2);
//        TreeNodes nodes5 = new TreeNodes(9);
//        TreeNodes nodes6 = new TreeNodes(7);
//        TreeNodes nodes7 = new TreeNodes(13);
        TreeNode2 root = new TreeNode2(8);
        root.left = new TreeNode2(21);
        root.right = new TreeNode2(2);
        root.left.left = new TreeNode2(9);
        root.left.right = new TreeNode2(7);
        root.right.left = new TreeNode2(13);
        root.right.right = new TreeNode2(8);

        ReverseOddLevel solver = new ReverseOddLevel();
        System.out.println("Before reversal:");
        solver.printLevelOrder(root);

        solver.reverseOddLevels(root);

        System.out.println("\nAfter reversal:");
        solver.printLevelOrder(root);
    }
}
