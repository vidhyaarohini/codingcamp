public class EmpGetTarget {
    public static void main(String[] args) {
        int[] array ={5,1,4,2,2};
        int target = 6;
        int gotTarget = achieveTarget(array,target);
        System.out.println("check **"+gotTarget);
    }

    private static int achieveTarget(int[] array, int target) {
        int count=0;
        for(int i:array){
            if(i>=target){
                count++;
            }
        }
        return count;
    }
}
