public class Divide {
    public static int[] div(int[] array1, int digit){
        int remainder = 0;
        int localDigit;
        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            localDigit = remainder * 10 + array1[i];
            result[i] = localDigit / digit;
            remainder = localDigit % digit;
        }

        return result;
    }
}
