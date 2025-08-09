package multithreading;

public class MyThread extends Thread{
    public void run()
    {

    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
