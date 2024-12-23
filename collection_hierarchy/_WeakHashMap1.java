package collection_hierarchy;

import java.util.Map;
import java.util.WeakHashMap;

public class _WeakHashMap1 {
    public static void main(String[] args) {

        WeakHashMap<String,Integer>map = new WeakHashMap<>();
        dataPreprocessing(map);
        System.out.println(map);
        System.gc();
        computation();
        System.out.println(map);

    }
    public static void dataPreprocessing(Map<String,Integer> map){
        String key1 = new String("key1");
        String key2 = new String("key2");

        map.put(key1,11);
        map.put(key2,12);
    }
    public static void computation(){
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
