import java.util.Arrays;

public class Even0Odd1 {
    public static void main(String[] args) {
        int[] array ={4,3,2,1};
        for(int i=0;i< array.length;i++){
            array[i]= array[i] & 1;
        }
        Arrays.sort(array);
        System.out.println("chck "+ Arrays.toString(array));
    }
}
