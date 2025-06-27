public class BalanceRL {
    public static void main(String[] args) {
        String s ="LLLLRRRR";
        int count =0;
        int ch =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                ch++;
            }else{
                ch--;// RRRR -4 +1 => -3//RRR  -3+1 = -2//RR -2 +1 = -1 //R -1 +1 =0
            }
            if(ch==0){
                count++;
            }
        }
        System.out.println("count **"+count);
    }
}
