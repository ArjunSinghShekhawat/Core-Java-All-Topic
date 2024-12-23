package collection_hierarchy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _HashMap1 {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"arjun");
        map.put(2,"anshu");
        map.put(3,"keshav");
        map.put(4,"jay");
        map.put(5,"pintu");

        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("jay"));
        Set<Integer> set = map.keySet();
        System.out.println(set);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get(2));
        System.out.println(map.values());

        for(Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        map.remove(2);
        map.remove(3,"jay");

        System.out.println(map);

        System.out.println(map.getOrDefault(11,"pipi"));
        System.out.println(map.putIfAbsent(2,"jiya kishori"));
        System.out.println(map);
    }
}
