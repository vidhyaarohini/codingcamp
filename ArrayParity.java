import java.util.Arrays;

public class ArrayParity {
    public static void main(String[] args) {
        int[] array = {4,3,2,1};
        for(int i=0;i< array.length;i++){
            if(array[i]%2==0){
                array[i]=0;
            }else{
                array[i]=1;
            }
        }
        Arrays.sort(array);
        System.out.println("check : "+Arrays.toString(array));
    }
}
