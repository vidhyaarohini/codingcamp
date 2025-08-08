public class MaxWealth {
    public static void main(String[] args) {
        int[][] array = {{2,8,7},{7,1,3},{1,9,5}};
        int res =0;
        for(int i=0;i<array.length;i++){
            int temp=0;
            for(int j=0;j<array[i].length;j++){
                temp += array[i][j];
            }
            res = Math.max(res,temp);
        }
        System.out.println("res :: "+res);
    }
}
