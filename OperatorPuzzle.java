class OperatorPuzzle {
    public static void main(String[] args) {
        int i=10;
        // Conditional operator (ternary)
        int x = i > 5 ? 100 : 200;
        System.out.println(x);

        int j=100;
        int y = j > 500 ? 50 : j > 200 ? 75 : 80;
        System.out.println(y);

        int a = 3;
        switch(a) {
            case 1: System.out.println("ONE");
            case 2: System.out.println("TWO");
            case 3: System.out.println("THREE");
            case 4: System.out.println("FOUR");
            default : System.out.println("Default");
        }

        // puzzle 1
        int x1 = 12;
        while (x1 < 10) {
            x1--;
        }
        System.out.print(x1);        
    }
}