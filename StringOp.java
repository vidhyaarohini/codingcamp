public class StringOp {
    public static void main(String[] args) {
        String[] operations = {"++X","++X","X++"};
        int start =0;
        int end = 2;
        int val =0;
        for(int i=0;i< operations.length;i++){
            if(operations[i].length()<3){
                System.out.println("not valid");
                System.exit(0);
            }
            if(operations[i].charAt(start)=='-'&& operations[i].charAt(start+1)=='-'){
                val -= 1;
            }else if(operations[i].charAt(end)=='+'&& operations[i].charAt(end-1)=='+'){
                val +=1;
            }else if(operations[i].charAt(start)=='+'&& operations[i].charAt(start+1)=='+'){
                val += 1;
            }else if(operations[i].charAt(end)=='-'&& operations[i].charAt(end-1)=='-'){
                val -=1;
            }

        }
        System.out.println("check the val : "+val);
    }
}
