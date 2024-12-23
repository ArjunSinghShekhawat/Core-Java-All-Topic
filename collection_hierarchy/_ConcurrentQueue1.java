package collection_hierarchy;

import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class _ConcurrentQueue1 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer>queue = new ConcurrentLinkedQueue<>(Arrays.asList(1,2,3,45));
        ConcurrentLinkedDeque<Integer>deque = new ConcurrentLinkedDeque<>(Arrays.asList(32,54,67));

        System.out.println(queue);
        System.out.println(deque);
    }
}
