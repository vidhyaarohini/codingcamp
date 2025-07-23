public class FindCenterGraph1 {
    public static void main(String[] args) {
        int[][] nodes = {{3,1},{2,3},{3,2},{2,3},{3,6}};
        FindCenterGraph1 findCenterGraph1 = new FindCenterGraph1();
        findCenterGraph1.findStarNode(nodes);
    }

    private void findStarNode(int[][] nodes) {
        int starNode = nodes[0][0] == nodes[1][0] || nodes[0][0]==nodes[1][1]?nodes[0][0]:nodes[0][1];
        System.out.println("star node "+starNode);
    }
}
