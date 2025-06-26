import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedToSortedArray {
    public static void main(String[] args) {
        int[] array1 ={7,8,9,1,2,4,18,2};
        int[] array2 = {89,6,78,2,3,45,90};
      int[] sortedArray=  IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().toArray();
      System.out.println("sorted "+Arrays.toString(sortedArray));
    }
}
