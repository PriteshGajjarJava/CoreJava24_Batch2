// a)java NestedTryCatchPuzzle b) java NestedTryCatchPuzzle 4 c) java NestedTryCatchPuzzle 4 10
// d)java NestedTryCatchPuzzle ONE e) java NestedTryCatchPuzzle 2 TWO

class NestedTryCatchPuzzle {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            try {
                System.out.println(20/n);
            }catch(ArithmeticException ae) {
                System.out.println(args[1]);
            }finally {
                System.out.println("FINALLY1");
                System.out.println(50/n);
            }
        }catch(ArrayIndexOutOfBoundsException aioob) {
            System.out.println("AIOOB");
        }
        catch(RuntimeException re) {
            System.out.println("RE");
        }finally {
            System.out.println("FINALLY2");
        }
        System.out.println("END");
    }
}