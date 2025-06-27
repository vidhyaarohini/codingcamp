import java.util.Arrays;

public class MinProdSum {
    public static void main(String[] args) {
        int[] array1 ={2,1,4,5,7};// 1,2,4,5,7
        int[] array2 = {3,2,4,8,6};// 2,3,4,6,8
        int min = minProdArray(array1,array2);//6+2+16+40+42
        System.out.println("min prod ***"+min);
    }

    private static int minProdArray(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        int sum = 0;
        int total =0;
        int length = array1.length;
        for (int i = 0; i < length; i++) {
            System.out.println("check arr1 "+array1[i]);
            System.out.println("check arr2 "+array2[length-1-i]);
            sum += array1[i] * array2[length - 1 - i];
        }
        for(int i=0;i<length;i++){
         total += array1[i]*array2[i];
        }
        System.out.println("check **"+total);
        return sum;
    }
}
