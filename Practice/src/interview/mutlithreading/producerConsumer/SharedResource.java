package interview.mutlithreading.producerConsumer;

public class SharedResource {

    boolean itemAvailable = false;

    public synchronized void addItem()
    {
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName() + " and invoking notify" );
        notifyAll();
    }
    public synchronized  void consumeItem(){
        System.out.println("Consumed item method invoked by: " +Thread.currentThread().getName());

        while(!itemAvailable) {
            try {
                System.out.println("Consumer Thread " +Thread.currentThread().getName() +" is waiting");
                wait();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Item Consumed by: "+Thread.currentThread().getName());
        itemAvailable = false;
    }
}
