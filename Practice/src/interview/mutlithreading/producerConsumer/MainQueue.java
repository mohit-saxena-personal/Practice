package interview.mutlithreading.producerConsumer;

public class MainQueue {

    public static void main(String[] args) {
        SharedResourceQueue sharedBuffer = new SharedResourceQueue(2);
        Thread producerThread = new Thread(()->{
           try{
               for(int i=0; i<=60; i++){
                   sharedBuffer.produce(i);
               }
           } catch (Exception e)
           {

           }
        });
        Thread consumerThread = new Thread(()->{
            try{
                for(int i=0; i<=60; i++){
                    sharedBuffer.consume();
                }
            } catch (Exception e)
            {

            }
        });

        producerThread.start();
        consumerThread.start();
    }

}
