package map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConCurrentSkipListMap {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,String>map = new ConcurrentSkipListMap<>();

        map.put(3,"arjun");
        map.put(1,"jay");
        map.put(2,"lokesh");

        System.out.println(map);
    }
}
