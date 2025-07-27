import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums ={1,2,1};
        int len = nums.length;
        int[] res = new int[len*2];
        int count =2;
        int j=0;
        while(count>0){
            for(int i=0;i<len;i++){
                res[j] = nums[i];
                j++;
            }
            count--;
        }
        System.out.println("res **"+ Arrays.toString(res));
    }
}
