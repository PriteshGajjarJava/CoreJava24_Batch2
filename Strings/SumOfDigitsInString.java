// input : ab7cd92e 
// output : 7+9+2=18
// aa1152bb2  => 11

class SumOfDigitsInString {
    public static void main(String[] args) {
        String str = "ab7cd92e";
        int sum = sumOfDigits(str);
        System.out.println("Sum is: " + sum);
    }

    static int sumOfDigits(String str) {
        int sum = 0;
        for (int i=0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}