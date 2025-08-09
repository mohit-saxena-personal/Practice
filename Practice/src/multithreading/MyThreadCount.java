package multithreading;

public class MyThreadCount extends Thread{
    private Counter counter;

    public MyThreadCount(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i =1;i<=1000;i++)
        {
            counter.increment();
        }
    }
}
