class Demo3 {
    public static void main(String[] args) {
        // String s = null;
        // System.out.println(s.length()); // NPE: NullPointerException
        
        System.out.println(9/0); // ArithmeticException
        String s = "one";
        int i = Integer.parseInt(s); // NFE: NumberFormatException
        System.out.println(s.charAt(5));// StringIndexOutOfBoundsException


    }
}