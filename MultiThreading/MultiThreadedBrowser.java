// Step1: Declare a class which inherits "Thread" class (extends)
// Step2: Write "public void run()" method in your thread class
class DownloadThread extends Thread {
    public void run() {
        MultiThreadedBrowser.printThreadName();
        for (int i=1; i<=100; i++) {
            System.out.println("Downloading..." + i + "%");
        }
    }
}
// Step1: Declare a class which inherits "Runnable" interface (implements)
// Step2: Write "public void run()" method
class StreamingThread implements Runnable {
        public void run() {
           MultiThreadedBrowser.printThreadName(); 
            for (int i=1; i<=100; i++) {
                System.out.println("Streaming..." + i + "%");
            }
        }
}

class MultiThreadedBrowser {
    // Method to print current thread name
    static void printThreadName() {
        Thread t = Thread.currentThread();
        System.out.println("****" + t.getName());
    }
    public static void main(String[] args) {
        // In main thread create object of above class
        DownloadThread t1 = new DownloadThread();
        t1.setName("Download-Thread");
        t1.start();

        // Streaming thread
        StreamingThread job = new StreamingThread();
        Thread t2 = new Thread(job);
        t2.setName("Streaming-Thread");
        t2.start();

        try {
            Thread.sleep(100);
        }catch(InterruptedException e) {}
        // Logic on main-thread
        for (int i=1; i<=100; i++) {
            System.out.println("Browsing..." + i + "%");
        }
    }
}