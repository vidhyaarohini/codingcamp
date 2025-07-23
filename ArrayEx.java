import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        String[] array1 ={"hello","java"};
        String[] array2 = new String[]{"python","sql"};
        String[][] stringLiteral = new String[][]{array1,array2};
        System.out.println("check 1 "+array1[0]);
        System.out.println("check 2 "+array2[1]);
        System.out.println("check 3 "+ Arrays.toString(stringLiteral[0]));
        System.out.println("check 4 "+Arrays.toString(stringLiteral[1]));

    }
}
