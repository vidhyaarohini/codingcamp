public class BitwiseOr {
    public static void main(String[] args) {
        int[] binary ={5,3,7,2};
        for(int i=0;i<binary.length-1;i++){
            int result = binary[i]| binary[i+1];
            System.out.println("check "+result);
        }

    }
}
