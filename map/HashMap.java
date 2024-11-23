package map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        //HashMap
        Map<Integer,String> map = new java.util.HashMap<>();

        map.put(1,"arjun");
        map.put(2,"raju");
        map.put(3,"ram");

        System.out.println(map);

        map.putIfAbsent(4,"rakesh");
        map.putIfAbsent(4,"jay");

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(11,null));

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey((2)));
        System.out.println(map.containsValue("arjun"));
        System.out.println(map.keySet());
        System.out.println(map.replace(1,"arjun","arjun ji"));
        System.out.println(map);

        map.remove(1);
        map.remove(2,"raju");

        System.out.println(map);

        System.out.println(map.entrySet());
        map.computeIfPresent(3,(key,value)->value.toUpperCase());
        map.computeIfAbsent(5,(key)->"jai");
        System.out.println(map);

    }
}
