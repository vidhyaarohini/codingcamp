import java.util.LinkedList;

class TreeN{
    int val;
    TreeN left, right;
    TreeN(int v){
        this.val = v;
    }
    TreeN(int v, TreeN l, TreeN r){
        this.val = v;
        this.left = l;
        this.right = r;
    }
}
public class DeepestLeavesSum {
    public int deepestSum(TreeN treeN){
        LinkedList<TreeN> treeNS = new LinkedList<>();
        int i,res=0;
        treeNS.add(treeN);
        while(!treeNS.isEmpty()){
            for(i=treeNS.size()-1,res=0;i>=0;i--){
                TreeN treeN1 = treeNS.poll();
                res += treeN1.val;
                if(treeN1.right != null) treeNS.add(treeN1.right);
                if(treeN1.left != null) treeNS.add(treeN1.left);
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        TreeN root = new TreeN(1);
        root.left = new TreeN(2);
        root.right = new TreeN(3);
        root.left.left = new TreeN(4);
        root.left.right = new TreeN(5);
        //root.right.left = new TreeN(null);
        root.right.right = new TreeN(6);
        root.left.left.left = new TreeN(7);
       // root.left.left.right = new TreeN(null);
        //root.left.right.left = new TreeN(null);
        //root.left.right.right = new TreeN(null);
       // root.left.right.left.left = new TreeN(null);
        root.right.right.right =new TreeN(8);


        DeepestLeavesSum deepestLeavesSum = new DeepestLeavesSum();
        System.out.println("sum :"+deepestLeavesSum.deepestSum(root));
    }
}
