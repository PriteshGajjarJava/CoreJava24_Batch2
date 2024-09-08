class StringEquality {
    public static void main(String[] args) {
        // == operator checks memory address
        // equals() Method of String checks content 
        String s1 = "Sunday";
        String s2 = new String("Sunday");
        String s3 = "Sunday";
        String s4 = new String("Sunday");

        System.out.println(s1==s2);
        System.out.println(s1==s3); 
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s4));

        String s5 = "Java";
        String s6 = "JAVA";
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}