public class NumOfGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        int j=0;
        String pairs ="";
        int count =0;
        while(j< nums.length-1) {
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[j] == nums[i]) {
                    pairs += "(" + j + "," + i + "),";
                    count++;
                }
            }
            j++;
        }
        System.out.println("check str "+pairs);
        System.out.println("count : "+count);
    }
}
