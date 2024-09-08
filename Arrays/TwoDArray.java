public class TwoDArray {
    public static void main(String[] args) {
        // [ 1 2 3 4]
        // [ 5 6    ]
        // [ 7 8 9 10 11]
        int[][] arr = new int[3][]; // 3 rows (fixed), column count can vary
        arr[0] = new int[]{1,2, 3, 4 };
        arr[1] = new int[]{5,6};
        arr[2] = new int[]{7,8,9,10,11};

        // Total number of rows in 2 darray = arr.length
        for (int i=0 ; i < arr.length; i++) {
            for (int j=0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// It's possible to create following array in Java (Fix rows, colum count vary)
// [ 1 2 3 4]
// [ 2 3    ]
// [ 4 5 8 9 10]
// 3 rows column size can vary