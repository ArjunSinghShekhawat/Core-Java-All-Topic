package collection_hierarchy;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class _TreeMap1 {
    public static void main(String[] args) {

       /** SortedMap<Integer,String>names = new TreeMap<>();

        set of data

        names.put(5,"jiya");
        names.put(1,"arjun");
        names.put(2,"anshu");
        names.put(3,"komal");
        names.put(4,"vikash");

        System.out.println(names);
        System.out.println(names.headMap(3));
        System.out.println(names.tailMap(3));
        System.out.println(names.subMap(2,5));
        System.out.println(names.firstEntry());
        System.out.println(names.lastEntry());*/


       /* NavigableMap<Integer,String> names1 = new TreeMap<>();
        //closest value of data find help

        names1.put(5,"jiya");
        names1.put(1,"arjun");
        names1.put(2,"anshu");
        names1.put(3,"komal");
        names1.put(4,"vikash");

        System.out.println(names1);
        System.out.println(names1.ceilingKey(3));
        System.out.println(names1.floorKey(4));
        System.out.println(names1.lowerKey(3));
        System.out.println(names1.higherKey(2));*/

        TreeMap<Integer,String>names = new TreeMap<>();

        //both feature

        names.put(5,"jiya");
        names.put(1,"arjun");
        names.put(2,"anshu");
        names.put(3,"komal");
        names.put(4,"vikash");

        System.out.println(names);
        System.out.println(names.headMap(3));
        System.out.println(names.tailMap(3));
        System.out.println(names.subMap(2,5));
        System.out.println(names.firstEntry());
        System.out.println(names.lastEntry());
        System.out.println(names.ceilingKey(3));
        System.out.println(names.floorKey(4));
        System.out.println(names.lowerKey(3));
        System.out.println(names.higherKey(2));


    }
}
