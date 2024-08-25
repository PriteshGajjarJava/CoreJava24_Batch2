public class SearchInArray {
   public static void main(String[] args) {
    int[] arr = { 1, 3, 8, 12, 11, 10, 6, 9};

    System.out.println("8 exists in array =>" + search(arr, 8)); // true
    System.out.println("4 exists in array =>" + search(arr, 4)); // false
   }
   // O(n)
   static boolean search(int[] arr, int n) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == n) return true;
        }
        return false;
   }
}
