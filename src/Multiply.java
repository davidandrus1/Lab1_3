public class Multiply {
    public static int[] mul(int[] array1, int digit){
        int localDigit  = 0;
        int[] result = new int[array1.length+1];
        int carry = 0;

        for(int i = array1.length - 1; i >= 0; i--){
            localDigit = array1[i] * digit + carry;
            result[i + 1] = localDigit % 10;
            carry = localDigit / 10;

        }
        if(carry > 0){
            result[0] = carry;
        }
        return result;
    }
}
