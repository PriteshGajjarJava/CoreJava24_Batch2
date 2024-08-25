// change even number to 0 and odd to 1
// e.g. [14, 5, 11, 9, 10] => [0,1,1,1,0]

// WAP which counts number of odd element and number of even elements

import java.util.Arrays;
public class FindAndReplaceOddEven {
    public static void main(String[] args) {
        int[] arr = {15, 14, 1, 10, 9, 11};
        replaceOddEven(arr);
        System.out.println(Arrays.toString(arr));    
    
    }
    static void replaceOddEven(int[] arr) {
        for (int i=0 ; i < arr.length; i++) {
            arr[i] = arr[i] % 2 == 0 ? 0 : 1;
            // if (arr[i] % 2 == 0) { arr[i] = 0} else { arr[i]=1;}
        }
    }
}
