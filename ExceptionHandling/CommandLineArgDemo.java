class CommandLineArgDemo {
    //["11", "PGA"]
    public static void main(String[] args) {
        System.out.println(args.length);
        int rollNo = Integer.parseInt(args[0]);
        String name = args[1];
        System.out.println("You have passed: " + rollNo + "," + name);
    }
}