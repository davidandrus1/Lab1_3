public class Sum {
        public static int[] sum(int[] array1, int[] array2){
            int localSum = 0;
            int[] result = new int[array1.length+1];
            int carry = 0;

            for(int i = array1.length - 1; i >= 0; i--){
                localSum = array1[i] + array2[i] + carry;
                result[i + 1] = localSum % 10;
                carry = localSum / 10;

            }

            if(carry > 0){
                result[0] = carry;
            }

            return result;
    }
}
