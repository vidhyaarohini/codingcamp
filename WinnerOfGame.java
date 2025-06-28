import java.util.HashMap;
import java.util.Map;

public class WinnerOfGame {
    public static void main(String[] args) {
        String s="AAABBBBBAAA";
       System.out.println(winnerOfGame(s));

    }
    public static  boolean winnerOfGame(String colors) {
        Map<Character, Integer> c = new HashMap<>();
        c.put('A', 0);
        c.put('B', 0);

        for (int i = 0; i < colors.length(); i++) {
            char x = colors.charAt(i);
            int count = 0;

            while (i < colors.length() && colors.charAt(i) == x) {
                i++;
                count++;
            }

            c.put(x, c.get(x) + Math.max(count - 2, 0));
            System.out.println("check x count "+x+"total "+count);
            i--;
        }

        return c.get('A') > c.get('B');
    }
}
