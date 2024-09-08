class StringPuzz {
    public static void main(String[] args) {
        String str = "Hare Krishna Hare Rama!";
        int i = str.substring(str.indexOf("Krishna")).substring(4).indexOf("Ram");
        String s1 = str.substring(str.lastIndexOf("Hare")).toUpperCase();
        System.out.println(i);
        System.out.println(s1);
    }
}