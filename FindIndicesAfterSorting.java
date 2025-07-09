import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndicesAfterSorting {
    public static void main(String[] args) {
        int[] array = {1,2,5,2,3};
        int target =5;
        Arrays.sort(array);
        System.out.println("cehck arrayt"+Arrays.toString(array));
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                list.add(i);
            }
        }
        System.out.println("chedk the array :"+list);
    }
}
