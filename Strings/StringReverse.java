
class StringReverse {
    public static void main(String[] args) {
        String s = "Program";
        String output = reverse(s);// margorP
        System.out.println("Reverse : " + output);
    }
    static String reverse(String str) {
        char[] arr = str.toCharArray();
        // Reverse array logic
        for (int i=0, j=arr.length-1 ; i < j; i++, j--) {
            //Swap
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        return new String(arr);
    }
}