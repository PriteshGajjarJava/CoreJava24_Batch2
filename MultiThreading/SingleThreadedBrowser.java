class SingleThreadedBrowser {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        for (int i=1; i<=100; i++) {
            System.out.println("Browsing..." + i + "%");
        }
        for (int i=1; i<=100; i++) {
            System.out.println("Downloading..." + i + "%");
        }
        for (int i=1; i<=100; i++) {
            System.out.println("Streaming..." + i + "%");
        }
    }
}