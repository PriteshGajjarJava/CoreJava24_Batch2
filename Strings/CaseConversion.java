//aBcDEfGH => AbCdeFgh 
              
class CaseConversion {
    public static void main(String[] args) {
        String str = "aBcDEfGH";
        String output = alterCase(str);
        System.out.println("Output is: " + output);
    }

    static String alterCase(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                output = output + Character.toLowerCase(ch);
            } else {
                output = output + Character.toUpperCase(ch);
            }
        }
        return output;
    }

}