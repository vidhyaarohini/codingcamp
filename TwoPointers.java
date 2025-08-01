import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        int[] nums ={2,1,7,9,3,5,10};
        int pivot = 10;
        int left =0, right= nums.length-1;
        int[] result = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (nums[i] < pivot) {
                result[left] = nums[i];
                left++;
            }

            if (nums[j] > pivot) {
                result[right] = nums[j];
                right--;
            }
        }

        while (left <= right) {
            result[left] = pivot;
            left++;
        }

      //  return result;
        System.out.println("checl "+ Arrays.toString(result));
    }
}
