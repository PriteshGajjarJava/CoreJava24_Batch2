class Forloop {
    public static void main(String[] args) {
        // Print 1-10 numbers
        for (int i=1; i<=10; i++) {System.out.println(i);}

        // Print 10-1 in reverse
        for (int i=10; i>=1; i--) {System.out.println(i);}

        // Print numbers between 1-10 by incrementing i by 2 (1 3 5 7 9)
        for (int i=1; i<=10; i+=2) {System.out.println(i);}

        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        // Array traverse using normal for loop
        for (int i=0; i < arr.length; i++) { System.out.println(arr[i]); }

        // Array traverse using for-each loop
        for (int data : arr) { System.out.println(data);}

        String[] cities = {"Mumbai", "Pune", "Nashik", "Goa"};
        for (String city : cities) { System.out.println(city);}
    } 
}