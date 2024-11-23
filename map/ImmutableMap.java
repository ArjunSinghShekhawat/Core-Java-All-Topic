package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {

        //not allow add,update,set operation only perform read operation
        //by default mutable in nature map
        Map<Map.Entry<Integer, String>, Map.Entry<Integer, String>> entry = Map.of(Map.entry(1, "arjun"), Map.entry(2, "jay"), Map.entry(3, "krish"), Map.entry(4, "pintu"));
        System.out.println(entry);


        Map<Integer,String>map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        System.out.println(map);

        Map<Integer, String> map1 = Collections.synchronizedMap(map);
        System.out.println(map1);
    }
}
