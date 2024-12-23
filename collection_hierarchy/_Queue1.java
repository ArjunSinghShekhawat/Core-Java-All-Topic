package collection_hierarchy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _Queue1 {
    public static void main(String[] args) {

        //mean heap data structure
        //take O(log) time for most of operations
        Queue<Integer>queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(4);
        queue.add(32);

        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.isEmpty());

        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }



    }
}
