package collection_hierarchy;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class _LinkedHasMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>map = new LinkedHashMap<>();

        map.put(1,"apple");
        map.put(2,"mango");
        map.put(3,"banana");
        map.put(4,"orange");
        map.put(5,"payaya");

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsValue("apple"));
        System.out.println(map.containsKey(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.values());

    }
}
