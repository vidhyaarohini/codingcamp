public class CountToTarget {
    public static void main(String[] args) {
        int[] array ={-1,1,2,3,1};
        int target =2;
        String res="";
        int count =0;

        /*for(int i=0,j=0;i<array.length-1;i++){
            if(array[j]+array[i+1]<target){
               res += array[i]+","+array[i+1];
            }
            if(i==array.length-2){
                j++;
            }
        }
        System.out.println("check res "+res);*/

        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]<target){
                    res+="("+array[i]+","+array[j]+")";
                    count+=1;
                }
            }
        }
        System.out.println("check res "+res);
        System.out.println("count is :"+count);
    }
}
