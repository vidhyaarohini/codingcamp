import java.util.Arrays;

public class NumberSmaller {
    public static void main(String[] args) {
        int[] array ={6,5,4,8};
        int[] newArray = new int[array.length];
        for(int i=0;i< array.length;i++){
            int num = array[i];
            int count =0;
            for(int j=0;j<array.length;j++){
                if(i!=j){
                    if(array[i]>array[j]){
                        count +=1;
                    }
                }
            }
            newArray[i]= count;
        }
        System.out.println("check "+ Arrays.toString(newArray));
    }
}
