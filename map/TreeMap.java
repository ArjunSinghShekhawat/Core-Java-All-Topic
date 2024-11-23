package map;

public class TreeMap {
    public static void main(String[] args) {

        //implement both interface sortedMap and navigableMap
        //not accept null key
        //internally used read black tree
        //sorted keys
        //take O(log(n)) time for all operation

        java.util.TreeMap<Integer,String>students=new java.util.TreeMap<>();
        students.put(3,"arjun");
        students.put(1,"ankit");
        students.put(5,"jay");
        students.put(4,"jiya");

        System.out.println(students);
        System.out.println(students.headMap(3));
        System.out.println(students.tailMap(3));
        System.out.println(students.floorEntry(2));
        System.out.println(students.ceilingEntry(2));
        System.out.println(students.size());
        System.out.println(students.isEmpty());
    }
}
