

     class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public class TreeReverse {
        private int sum = 0;

        public TreeNode bstToGst(TreeNode node) {
            if (node != null) {
                bstToGst(node.right);
                sum += node.val;
                node.val = sum;
                bstToGst(node.left);
            }
            return node;
        }
    }
