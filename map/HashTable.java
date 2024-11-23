package map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        //synchronized and thread safe
        //all methods synchronized
        //slower and heavy weight task because used locking

        Hashtable<Integer,String>hashtable = new Hashtable<>();
        hashtable.put(1,"arjun");
        hashtable.put(2,"govind");
        hashtable.put(3,"anshu");

        Enumeration<String> elements = hashtable.elements();

        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
