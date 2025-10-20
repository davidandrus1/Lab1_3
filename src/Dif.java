public class Dif {
    public static int[] dif(int[] array1, int[] array2){
        int localDif = 0;
        int[] result = new int[array1.length];
        int carry = 0;

        for(int i = array1.length - 1; i >= 0; i--){
            localDif = array1[i] - array2[i] - carry;
            if(localDif < 0){
                localDif+=10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            result[i] = localDif;
        }
        return result;
    }
}
