import java.util.ArrayList;
import java.util.List;

public class GraphAddingValue {
    public void addingNode(int[][] nodes, int start, List<List> res, List path ){
        if(start== nodes.length-1){
            res.add(new ArrayList<Integer>(path));
        }
        for(int nextNode : nodes[start]){
            path.add(nextNode);
            addingNode(nodes,nextNode,res,path);
            path.remove(path.size()-1);
        }

    }

    public static void main(String[] args) {
        int[][] graph = {{1,2},{3},{3},{}};
        List<Integer> path = new ArrayList<>();
        path.add(0);
        List<List> res = new ArrayList<>();
        GraphAddingValue graphAddingValue = new GraphAddingValue();
        graphAddingValue.addingNode(graph,0,res,path);
        System.out.println("check "+res);
    }
}
