class WordCount {
    public static void main(String [] args) {   
        String s = "We are learning java";
        int cnt = wordsCount(s);
        System.out.println("Count of words:" + cnt);
    }

    static int wordsCount(String str) {
        String[] arr = str.split(" "); // ["We","are","learning","java"]
        return arr.length;
        // return str.split(" ").length;
    }
}