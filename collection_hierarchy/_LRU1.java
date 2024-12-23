package collection_hierarchy;

import java.util.LinkedHashMap;
import java.util.Map;

public class _LRU1<K,V> extends LinkedHashMap<K,V> {
    private  final int capacity;
    public _LRU1(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        _LRU1<Integer,String>data = new _LRU1<>(3);

        data.put(1,"computer");
        data.put(2,"laptop");
        data.put(3,"mouse");
        data.get(1);
        data.get(2);
        data.put(4,"cable");


        System.out.println(data);

    }
}
