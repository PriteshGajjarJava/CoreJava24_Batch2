// WAP which does addition of 1-100 by using 10 threads (t1: 1-10, t2: 11-20 and so on)
class AdditionThread extends Thread {
    int start, end, sum;
    AdditionThread(int start, int end) { this.start = start; this.end = end;}
    public void run() {
        for(int i=start; i<=end; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + "=>" + sum);
    }
}
class AdditionThreadDemo {
    public static void main(String[] args) {
        AdditionThread[] t = new AdditionThread[10];//array
        // i=0 start=1, end=10, i=1 start=11, end 20, i=9 start=91 end =100 start=i*10 + 1
        for (int i=0; i < t.length; i++) {
            int start = i*10 + 1;
            int end = i*10 + 10;
            t[i] = new AdditionThread(start, end);
            t[i].start();
            try {  t[i].join(); }catch(InterruptedException e) {}
        }
        int addition = 0;
        for (int i=0; i<10; i++) {
            addition += t[i].sum;
        }
        System.out.println("Final addition is: " + addition);
    }
}
