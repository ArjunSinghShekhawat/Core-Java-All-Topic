package collection_hierarchy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _ImmutableMap1 {
    public static void main(String[] args) {

        Map<Integer, String> map = Map.ofEntries(Map.entry(1, "arjun"), Map.entry(2, "majeet"), Map.entry(3, "komal"));
        System.out.println(map);

//        map.put(4,"pooja");
//        System.out.println(map);

        Map<Integer,String>map1 = new HashMap<>();

        map1.put(1,"jay");
        map1.put(2,"anshu");
        map1.put(3,"arjun");

        System.out.println(map1);

        Map<Integer, String> map2 = Collections.unmodifiableMap(map1);

        System.out.println(map2);
//        map2.put(44,"kka");


    }
}
