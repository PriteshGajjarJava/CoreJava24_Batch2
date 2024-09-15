// We are learning Java
// Java learning are We

class StringReverse {
    public static void main(String[] args) {
        String s = "Program";
        String output = reverse(s);// margorP
        System.out.println("Reverse : " + output);
    }
    static String reverse(String str) {
        String output = "";
        for(int i=str.length()-1; i>=0; i--) {
            output += str.charAt(i);//"margorP"
        }
        return output;
    }
    // static String reverse(String str) {
    //     char[] arr = str.toCharArray(); // ['P','r','o','g','r','a','m']
    //     // Reverse array logic
    //     for (int i=0, j=arr.length-1 ; i < j; i++, j--) {
    //         //Swap
    //         char t = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = t;
    //     }
    //     return new String(arr);
    // }
}