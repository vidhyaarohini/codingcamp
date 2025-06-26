import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class ThreeMaxMinValues {
    public static void main(String[] args) {
        int[] array1 ={7,8,9,1,2,4,18,2};
       Arrays.stream(array1).sorted().limit(3).forEach(System.out::println);
        Arrays.stream(array1).boxed().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
