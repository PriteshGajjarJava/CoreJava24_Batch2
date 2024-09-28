class Demo1 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] a = {1,2,3,4,5};
        System.out.println(a[1]);

        try {
            System.out.println("try-start");
            System.out.println(a[10]);
            System.out.println(a[3]);
            System.out.println("try-end");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed..");
        }
        System.out.println("End");
    }
}