package collection_hierarchy;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class _CurrentMap1 {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String>map = new ConcurrentHashMap<>();

        map.put(2,"apple");
        map.put(4,"banana");
        map.put(1,"orange");
        map.put(3,"papaya");

        System.out.println(map);

        ConcurrentMap<Integer,String>map1 = new ConcurrentSkipListMap<>();

        map1.put(2,"apple");
        map1.put(4,"banana");
        map1.put(1,"orange");
        map1.put(3,"papaya");

        System.out.println(map1);

    }
}
