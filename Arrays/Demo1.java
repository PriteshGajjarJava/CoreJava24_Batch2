import java.util.Arrays;
class Demo1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        // Travese
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Traverse using for-each loop
        for (int data : arr) {
            System.out.println(data);
        }
        
        // printing an array using in-built method
        System.out.println(Arrays.toString(arr));
    }
}