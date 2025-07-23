public class FindCenterGraph {
    public static void main(String[] args) {
        int[][] edges= {{1, 2}, {1, 2}, {4, 2}};
        FindCenterGraph findCenterGraph = new FindCenterGraph();
        findCenterGraph.findedges(edges);

    }
    public void findedges(int[][] edges){
        System.out.println("start 1 "+edges[0][0]);
        System.out.println("start 2 "+edges[1][0]);
        System.out.println("start 3 "+edges[1][1]);
        System.out.println("start 4 "+edges[0][1]);
        int starNode = edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]
                ? edges[0][0]
                : edges[0][1];
        System.out.println("check the star node val "+ starNode);
    }
}
