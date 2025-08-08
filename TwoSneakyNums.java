import java.util.HashMap;
import java.util.Map;

public class TwoSneakyNums {
    public static void main(String[] args) {
        int[] array = {1,0,0,1,3};
        Map<Integer,Integer> map1 = new HashMap<>();
        for( int i=0;i<array.length;i++){
            map1.put(array[i], map1.getOrDefault(map1.get(array[i]),0)+1);
        }
        System.out.println("cehck "+map1);
       for(Map.Entry<Integer,Integer> entry: map1.entrySet()){
            int[] array1 = new int[2];
            if(entry.getValue()==2){
                System.out.println(entry.getKey());
            }
        }
    }
}
