public class LexiGraphical {
    public static void main(String[] args) {
        String s="dbca";
        int c =2;
        String res ="";
        int len = s.length()-c+1;
        for(int i=0;i<len;i++){
            String temp ="";
            if(i+len<=s.length()){
                temp = s.substring(i,i+len);
            }else{
                temp = s.substring(i);
            }
            if(temp.compareTo(res)>0){
                res = temp;
            }
        }
        System.out.println("res "+res);
    }

}
