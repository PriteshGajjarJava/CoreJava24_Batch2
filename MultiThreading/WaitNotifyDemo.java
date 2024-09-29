// How to call wait()-notify()
// synchronized(obj) {obj.wait();}
// synchronized(obj) { obj.notify();}

class PenProductionThread extends Thread {
    Object obj;
    PenProductionThread(Object obj) {this.obj = obj; }
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.println("Pen " + i + " is ready");
            if (i%10==0) {
               try { Thread.sleep(50); } catch(InterruptedException e) {}
               synchronized(obj) { obj.notify();}
            }
        }
    }
}
class PenColoringThread extends Thread {
    Object obj;
    PenColoringThread(Object obj) {this.obj = obj; }
    public void run() {
        try {
            synchronized(obj) {obj.wait();}
        }catch(InterruptedException e){}

        for (int i=1; i<=100; i++) {
            System.out.println("Pen " + i + " is colored");
            if (i%10==0) {
                try {
                    synchronized(obj) {obj.wait();}
                } catch(InterruptedException e){}
            }
        }
    }
}
class WaitNotifyDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        PenProductionThread t1 = new PenProductionThread(obj);
        PenColoringThread t2 = new PenColoringThread(obj);
        t1.start();
        t2.start();
    }
}