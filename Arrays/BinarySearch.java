import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {22, 1, 7, 18, 81 , 70, 29, 33, 47, 51, 67, 93, 100, 59, 39};
        Arrays.sort(arr); // Binary search precondition is ARRAY MUST BE SORTED.
        for (int i=1 ; i<=100; i++) {
            if (binarySearch(arr, i)) {
                System.out.println(i + " found");    
            }
        }
    }

    static boolean binarySearch(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while(start <= end) {
            if (n == arr[mid]) return true;
            if (n > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return false;
    }
}
