package collection_hierarchy;

import java.util.concurrent.ConcurrentSkipListSet;

public class _ConcurrentSkipListSet1 {
    public static void main(String[] args) {
        //thread safe without blocking
        //used skip-list data structure
        //write operation take more time and read operation quickly perform


        ConcurrentSkipListSet<Integer>listSet = new ConcurrentSkipListSet<>();

        listSet.add(21);
        listSet.add(43);
        listSet.add(76);
        listSet.add(98);
        listSet.add(10);

        System.out.println(listSet);
    }
}
