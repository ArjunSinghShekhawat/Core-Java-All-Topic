package collection_hierarchy;

import java.util.Hashtable;

public class _HashTable1 {
    public static void main(String[] args) {

        //synchronized
        //thread safe
        //legacy class
        //slow as compare another collection class

        Hashtable<Integer,String>hashtable = new Hashtable<>();

        hashtable.put(1,"arjun");
        hashtable.put(2,"anshu");
        hashtable.put(3,"koaml");
        hashtable.put(4,"jay");
        hashtable.put(5,"kishan");

        System.out.println(hashtable);

    }
}
