package collection_hierarchy;

import java.util.concurrent.CopyOnWriteArrayList;

public class _CopyOnWriteArrayList1 {
    public static void main(String[] args) {

        //CopyOnWriteArrayList

        //Thread safe
        //Not synchronised
        //Light-weight in nature
        //all write operation create new copy of the array and all change occurred in the new copy of the array the old array is not disturb
        //read operation is normal
        //this class is when required more read operation and some write operation with thread safe


        CopyOnWriteArrayList<Integer>list=new CopyOnWriteArrayList<>();

        list.add(21);
        list.add(65);
        list.add(87);
        list.add(98);


        for(Integer element:list){
            System.out.print(element+" ");
            if(element==87){
                list.remove(Integer.valueOf(87));
            }
        }
        System.out.println();
        System.out.println(list+" ");


        CopyOnWriteArrayList<Integer>data = new CopyOnWriteArrayList<>();

        Thread thread1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                data.add(i);
            }
        });

        Thread thread2 = new Thread(()->{
            for(int i=1000;i<2000;i++){
                data.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }

        System.out.println(data.size());


    }
}
