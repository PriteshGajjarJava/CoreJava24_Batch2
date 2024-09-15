// We are learning Java
// Java learning are We

class WordSequenceReverse {
    public static void main(String[] args) {
        String s = "We are learning Java Programming";
        String output = revWordSequence(s);
        System.out.println("Output is: " + output);
    }

    static String revWordSequence(String str) {
       String[] words = str.split(" "); // ["We","are","learning","Java","Programming"];
       StringBuffer buffer = new StringBuffer("");
       for(int i=words.length-1; i>=0;i--) {
            buffer.append(words[i]+" ");
       }
       String output = buffer.toString().trim();
       return output;
    }
}