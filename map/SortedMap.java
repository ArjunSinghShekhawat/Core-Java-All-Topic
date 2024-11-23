package map;

import java.util.TreeMap;

public class SortedMap {
    public static void main(String[] args) {
        //entity store in sorted manner
        //used when work on sub-set  of dataset
        //not accept null key
        java.util.SortedMap<Integer,String>students=new TreeMap<>();

        students.put(3,"arjun");
        students.put(1,"ankit");
        students.put(5,"jay");
        students.put(4,"jiya");

        System.out.println(students);
        System.out.println(students.headMap(3));
        System.out.println(students.tailMap(3));
        System.out.println(students.firstKey());
        System.out.println(students.lastKey());
        System.out.println(students.firstEntry());
        System.out.println(students.lastEntry());
        System.out.println(students.size());
        System.out.println(students.isEmpty());
        System.out.println(students.subMap(2,4));
    }
}
