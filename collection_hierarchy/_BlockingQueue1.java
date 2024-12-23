package collection_hierarchy;

import java.util.concurrent.*;

public class _BlockingQueue1 {
    public static void main(String[] args) {
        BlockingQueue<String>queue = new ArrayBlockingQueue<>(3);
        BlockingQueue<String>queue1 = new LinkedBlockingQueue<>();
        BlockingQueue<String>queue2 = new PriorityBlockingQueue<>();



        Thread write = new Thread(()->{
            try{
                for(int i=0;i<10;i++){
                    Thread.sleep(1000);
                    queue.add("Step "+i);
                    System.out.println("write operation "+"Setp "+i);
                }
            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
        });

        Thread read = new Thread(()->{
            try{
                for(int i=0;i<10;i++){
                    Thread.sleep(3000);
                    System.out.println("Read Operation "+queue.poll());
                }
            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
        });
        write.start();
        read.start();

    }
}
