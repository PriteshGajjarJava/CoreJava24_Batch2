class IntegerWrapper {
    public static void main(String[] args) {
      int i = 20;
      Integer obj = Integer.valueOf(50); // Old way Integer obj = new Integer(50)
      
      int ans = i + obj; // AUTO Boxing
      System.out.println(ans);

      System.out.println(Integer.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE);
      String s = "100";
      int num = Integer.parseInt(s); // "100" => 100 (String to number conversion)
      System.out.println(Integer.toBinaryString(12));//1100
      System.out.println(Integer.toHexString(81));
      System.out.println(Integer.toOctalString(71));

      
    }
}