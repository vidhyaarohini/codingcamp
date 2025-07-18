import java.util.Arrays;

public class BitwiseOrAdjacent {
    public static int[] bitwiseOrAdjacent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            result[i] = nums[i] | nums[i + 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,7,9};
        int[] result = bitwiseOrAdjacent(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
