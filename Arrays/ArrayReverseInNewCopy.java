// Reverse an array without changing Original
// keep 2 different copies

import java.util.Arrays;

public class ArrayReverseInNewCopy {
    public static void main(String [] args) {
        int [] arr = {1,2,3,4,5};
        int [] rev = reverse(arr);
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Reverse: " + Arrays.toString(rev));
    }

    static int[] reverse(int[] arr) {
        int[] ans = new int[arr.length]; // create empty array
        for (int i=arr.length - 1, j=0 ; i >=0; i--, j++) {
            ans[j] = arr[i];
        }
        return ans;
    }
}
