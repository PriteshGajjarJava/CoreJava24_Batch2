public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {14, 18, 8, 19, 78, 51};
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
