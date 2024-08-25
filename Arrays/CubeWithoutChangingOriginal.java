// Program which takes original array as input and generate new array
// without modifying original
import java.util.Arrays;

public class CubeWithoutChangingOriginal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = cube(arr);
        System.out.println("Input arr=" + Arrays.toString(arr));
        System.out.println("Output arr=" + Arrays.toString(ans));
    }

    // input - array of int  - x[]
    // return value - array of int - result[]
    static int[] cube(int[] x) {
        int[] result = new int[x.length];
        for (int i=0 ; i < x.length; i++) {
            result[i] = x[i] * x[i] * x[i];
        }
        return result;
    }
}
