// We are learning Java
// eW era gninrael avaJ
class WordReverse {
    public static void main(String[] args) {
        String s = "We are learning Java";
        String output = reverseWords(s);
        System.out.println("Output is: " + output);
    }
    static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuffer buffer = new StringBuffer("");
        for (int i=0; i<words.length;i++) {
            String rev = reverseString(words[i]);
            buffer.append(rev + " ");
        }
        return buffer.toString().trim();
    }
    static String reverseString(String str) {
        String output = "";
        for(int i=str.length() - 1; i>=0; i--) {
            output+=str.charAt(i);
        }
        return output;
    }
}