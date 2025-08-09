import java.util.ArrayList;
import java.util.List;

public class kidMaxCandy {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> booleanList = kidswithCandies(candies,extraCandies);
        System.out.println("check **"+booleanList);
    }

    private static List<Boolean> kidswithCandies(int[] candies, int extraCandies) {
        int maxCandy =0;
        for(int i: candies){
            maxCandy = Math.max(maxCandy,i);
        }
        List<Boolean> list = new ArrayList<>();
        for(int num : candies){
            if(num+extraCandies>=maxCandy){
                list.add(true);
            }else{
                list.add(false);
            }

        }
        return list;
    }
}
