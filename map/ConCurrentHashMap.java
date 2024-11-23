package map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConCurrentHashMap {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String>map = new ConcurrentHashMap<>(1,2,3);

        Thread writeThread1 = new Thread(()->{
            for(int i=0;i<20;i++){
                System.out.print("Producer ");
                map.put(i,Thread.currentThread().getName());
            }
        });
        Thread writeThread2 = new Thread(()->{
            for(int i=20;i<40;i++){
                System.out.print("Producer ");
                map.put(i,Thread.currentThread().getName());
            }
        });
        Thread readThread = new Thread(()->{
            for(int i=0;i<40;i++){
                System.out.println("Consumer "+map.get(i));
            }
        });

        writeThread1.start();
        writeThread2.start();
        readThread.start();
        try{
            writeThread1.join();
            writeThread2.join();
            readThread.join();
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
        System.out.println(map);
    }
}
