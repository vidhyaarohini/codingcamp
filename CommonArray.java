import java.util.Arrays;

public class CommonArray {
    public static void main(String[] args) {
        int[] array1 = {1,3,2,4};
        int[] array2 = {3,1,2,4};
        int n = array1.length;
        int[] freq = new int[n+1];
        int[] res = new int[n];
        int common =0;
        for(int i=0;i<n;i++){
            if(++freq[array1[i]]==2) common++;
            if(++freq[array2[i]]==2) common++;
            res[i] = common;
        }
        System.out.println("check the res :"+ Arrays.toString(res));
    }
}
