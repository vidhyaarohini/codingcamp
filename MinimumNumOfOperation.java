import java.util.Arrays;

public class MinimumNumOfOperation {
    public static void main(String[] args) {
        String nums = "110";
        int[] res =new int[nums.length()];
        for(int i=0;i< nums.length();i++){
            int val = nums.charAt(i)-'0';
            int count =0;
            for(int j=0;j<nums.length();j++){
                if(i!= j&& nums.charAt(j)-'0'==1){
                    int sub = j-i;
                    count +=sub;
                }
            }
            res[i]= Math.abs(count);

        }
        System.out.println("check "+ Arrays.toString(res));
    }
}
