package collection_hierarchy;

import java.util.concurrent.SynchronousQueue;

public class _SynchronizedQueue1 {
    public static void main(String[] args) {
        SynchronousQueue<Integer>queue = new SynchronousQueue<>();

        Thread write = new Thread(()->{
            int i=0;
            while (true){
                try {
                    queue.put(i);
                    System.out.println("Write Operation "+i );
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
        });
        Thread read = new Thread(()->{
            while (true){
                try {
                    System.out.println("Read operation "+queue.take());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        write.start();
        read.start();
    }
}
