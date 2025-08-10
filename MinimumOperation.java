public class MinimumOperation {
    public static void main(String[] args) {
        int[] array ={3,9,7};
        int num =5;
        int total =0;
        for(int i : array){
            total +=i;
        }
        System.out.println("check : "+total%num);
    }
}
