public class Program6 {
 public static void main(String[] args) {
    int bufferSize = 5;
    int maxItemsToProduce = 10;

    buffer buffer = new buffer(bufferSize);

    Thread producer = new Thread(new Producer(buffer, maxItemsToProduce));

    Thread consumer = new Thread(new Consumer(buffer));

    producer.start();
    consumer.start();

    try{
        producer.join();
    } catch (InterruptedException e){
        return;
    }

    consumer.interrupt();
    System.out.println("Producer-Consumer Process completed.");
 }   
}

class buffer{
    private int[] buffer;
    private int count = 0;
    private int size;
    private int in = 0;
    private int out = 0;

    public buffer(int size){
        this.size = size;
        this.buffer = new int[size];
    }

    public synchronized void produce(int item){
        while (count == size) {
            try{
                wait();
            }catch(InterruptedException e){
                return;
            }
        }

        buffer[in] = item;
        in = (in + 1)%size;
        count++;
        System.out.println("Producer produced : "+item);
        notifyAll();
    }

    public synchronized int consume(){
        while (count==0) {
            try{
                wait();
            }catch(InterruptedException e){
                return -1;
            }
        }
        int item = buffer[out];
        out = (out+1)%size;
        count--;
        System.out.println("Consumer consumed : "+item);
        notifyAll();
        return item;
    }
}

class Producer implements Runnable{
    private buffer buffer;
    private int maxitems;
    public Producer(buffer buffer,int maxitems){
        this.buffer = buffer;
        this.maxitems = maxitems;
    }

    @Override
    public void run(){
        for(int i=0;i<maxitems;i++){
            buffer.produce(i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

class Consumer implements Runnable{
    private buffer buffer;

    public Consumer(buffer buffer){
        this.buffer=buffer;
    }

    @Override
    public void run(){
        while (true) {
            int item = buffer.consume();
            if (item==-1) {
                break;
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                return;
            }
        }
    }
}
