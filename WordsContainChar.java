import java.util.ArrayList;
import java.util.List;

public class WordsContainChar {
    public static void main(String[] args) {
        String[] words ={"leet","code"};
        char x= 'e';
        List<Integer> count = new ArrayList<>();
      for(int i=0;i<words.length;i++){
          if(words[i].contains(String.valueOf(x))){
              count.add(i);
          }
      }
      System.out.println("res : "+count);
      count.add(8);
      count.add(7);
        System.out.println("res : "+count);
    }
}
