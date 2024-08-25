// WAP which will convert an array with square of array values.
//e.g. input [1,2,3,4] => [1,4,9,16]
import java.util.Arrays;

public class PassingArrayToFunction {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40;

        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void fun(int[] x) {
        for (int i=0; i < x.length; i++) {
            x[i] = x[i] * x[i];
        }
    }
}
