class TypeCasting {
  public static void main(String[] args) {
    short s = 30;
    byte b = (byte)s; // Explicit Typecasting
    int i = s; // short to int - Implicit TypeCasting

    int j = 50;
    long l = j; // implicit typecasting
    float f = j;// implicit typecasting
    double d = j;// implicit typecasting
    short s1 = (short)j; // Explicit typecasting
  }
}