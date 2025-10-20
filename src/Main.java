import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Sum suma = new Sum();
        int[] array1 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] array2 = {1, 3, 0, 0, 0, 0, 0, 0, 0};

        int[] result = Sum.sum(array1, array2);
        System.out.printf(Arrays.toString(result));
    }

}

