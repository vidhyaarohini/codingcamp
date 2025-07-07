import java.util.ArrayList;
import java.util.List;

public class InterSectionOfArray {
    public static void main(String[] args) {
        int[] array1 ={1,2,3,6,7};
        int[] array2 ={2,3,4,5,7,12,};
        int[] array3 ={1,2,6,7,9,10,13};
           List<Integer> addedList =  intersectionArray(array1,array2,array3);
        System.out.println("list added :: "+addedList);
    }

    private static List<Integer> intersectionArray(int[] array1, int[] array2, int[] array3) {
        List<Integer> result = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i<array1.length && j<array2.length && k<array3.length){
            if(array1[i]==array2[j]&& array2[j]== array3[k]){
                result.add(array1[i]);
                i++;
                j++;
                k++;
            } else if(array1[i]<array2[j]){
                i++;
            }else if (array2[j]<array3[k]){
                j++;
            }else{
                k++;
            }
        }
        return  result;
    }
}
