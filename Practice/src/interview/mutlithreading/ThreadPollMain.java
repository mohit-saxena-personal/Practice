package interview.mutlithreading;

import java.util.concurrent.*;

public class ThreadPollMain {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES
                , new ArrayBlockingQueue<>(2), new CustomThreadFactory(),
                new CustomRejectHandler());

        executor.allowCoreThreadTimeOut(true);
        for(int i=0; i<7; i++){
            executor.submit(()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task processed by"+Thread.currentThread().getName());
            });
        }
    }

}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.setDaemon(false);
        return thread;

    }
}

class CustomRejectHandler implements RejectedExecutionHandler{


    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Rejected"+ r.toString());
    }
}