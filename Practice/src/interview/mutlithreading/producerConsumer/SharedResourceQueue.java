package interview.mutlithreading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResourceQueue {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResourceQueue(int bufferSize)
    {
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception{

        if(bufferSize == sharedBuffer.size()){
            System.out.println("Buffer is full, Producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: "+ item);
        notify();
    }

    public synchronized int consume() throws Exception{
        if(sharedBuffer.isEmpty()) {
            System.out.println("Buffer is empty consumer is waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumer item " + item);
        notify();
        return item;
    }

}
