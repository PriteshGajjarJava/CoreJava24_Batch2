class CharacterCount {
    public static void main(String[] args) {
        String str = "We are learning Java";
        int output = countCharacters(str, 'a');
        System.out.println("Occurances of e in str is: " + output);
    }

    static int countCharacters(String input, char ch) {
        int cnt = 0;
        for (int i=0 ; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                cnt++;
            } 
        }
        return cnt;
    }
}
