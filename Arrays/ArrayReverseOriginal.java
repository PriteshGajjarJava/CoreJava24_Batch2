import java.util.Arrays;

public class ArrayReverseOriginal {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        // 2pointer/index approach
        for (int i = 0 , j = arr.length -1 ; i < j ; i++, j--) {
            // swap
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
