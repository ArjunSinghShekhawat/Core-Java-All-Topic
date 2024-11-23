package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdenticalHashMap {
    public static void main(String[] args) {


        //generate hashcode by using address of the object not used key
        //used == operator to check key and value
        //light weight and faster

        IdentityHashMap<String,String> map = new IdentityHashMap<>();
        String key1 = new String("key");
        String key2 = new String("key");

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        map.put(key1,"arjun");
        map.put(key2,"mohit");

        System.out.println(map);
    }
}
