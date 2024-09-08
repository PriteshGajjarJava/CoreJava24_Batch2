public class StringFunctions {
    public static void main(String[] args) {
        String s1 = "String is immutable";
        String s2 = s1.substring(2);
        String s3 = s1.substring(11);

        System.out.println(s3.length());
        System.out.println(s2.toUpperCase().charAt(3));

        String s4 = s3.concat(" JAVA");
        int i = s4.indexOf("tab") + s1.indexOf("tab") + s2.indexOf("tab");
        System.out.println(i);

        String s5 = "Computer";
        s5.toUpperCase();
        System.out.println(s5);
    }
}
