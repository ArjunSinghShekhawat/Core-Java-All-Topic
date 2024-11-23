package map;

import java.util.Map;

class BrowserHistory<K,V> extends java.util.LinkedHashMap<K,V>{

    private final int capacity;

    public BrowserHistory(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }
}
public class LinkedHashMap {
    public static void main(String[] args) {
        //ordered
        //Used in caching to find least recently used entry
        //doubly linked list used internally and memory overhead
        //slow as compare hashmap
        java.util.LinkedHashMap<Integer,String>map = new java.util.LinkedHashMap<>();

        map.put(1,"banana");
        map.put(2,"mango");
        map.put(3,"papaya");

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("mango"));
        System.out.println(map.getOrDefault(1,"kuch nhi hai"));
        System.out.println(map.get(2));
        System.out.println(map.reversed());
        System.out.println(map.putFirst(0,"apple"));
        System.out.println(map);

        map.computeIfPresent(0,(key,value)->value.toUpperCase());
        map.computeIfAbsent(4,key->"grapes");
        System.out.println(map);

        map.remove(2,"apple");
        map.remove(0);

        System.out.println(map);


        //caching  find least recently used entry history
        BrowserHistory<Integer,String>browserHistory = new BrowserHistory<>(5);

        browserHistory.put(1,"java_T_point.com");
        browserHistory.put(2,"w3_school.com");
        browserHistory.put(3,"scale.com");
        browserHistory.put(4,"pw_skills.com");
        browserHistory.put(5,"code help.com");

        System.out.println(browserHistory.get(4));
        System.out.println(browserHistory.get(1));
        System.out.println(browserHistory);
        //least recently are present on top
        /* Output -: {2=w3_school.com, 3=scale.com, 5=code help.com, 4=pw_skills.com, 1=java_T_point.com} */

    }
}
