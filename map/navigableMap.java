package map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class navigableMap {
    public static void main(String[] args) {

        //extends sortedMap
        //provide navigation features means closet data
        //not accept null key
        NavigableMap<Integer,String>students=new TreeMap<>();

        students.put(3,"arjun");
        students.put(1,"ankit");
        students.put(5,"jay");
        students.put(4,"jiya");

        System.out.println(students);
        System.out.println(students.floorKey(2));
        System.out.println(students.ceilingKey(2));
        System.out.println(students.higherKey(2));
        System.out.println(students.lowerKey(2));
    }
}
