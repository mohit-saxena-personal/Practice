package multithreading;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThreadCount t1 = new MyThreadCount(counter);
        MyThreadCount t2 = new MyThreadCount(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
