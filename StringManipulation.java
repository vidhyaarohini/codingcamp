import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManipulation {
    public static void main(String[] args) {
        int[] array = {1,2,4,8,9,0};
        Map<Boolean, List<Integer>> check = Arrays.stream(array).boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("check odd "+check.get(true));
        String s="yhkjmdsnfdsk dfdsfn";
        Map<Character,Long> map1=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("check map "+map1);
        List<String> listStr = List.of("yello","check","sorting");
        listStr.stream().forEach(d->{String rev =new StringBuilder(d).reverse().toString();
        System.out.println("reversed "+rev);});
         String sample = listStr.stream().map(v -> new StringBuilder(v).reverse()).collect(Collectors.joining(" "));
         System.out.println("check str "+sample);
         List<String> listrev=listStr.stream().sorted().collect(Collectors.toList());
         System.out.println("sample 2 "+listrev);
    }
}
