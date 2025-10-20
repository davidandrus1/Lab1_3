import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Sum suma = new Sum();
        Dif diference = new Dif();
        int[] array1 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] array2 = {1, 3, 0, 0, 0, 0, 0, 0, 0};

        int[] result1 = Sum.sum(array1, array2);
        int[] result2 = Dif.dif(array1, array2);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

}

