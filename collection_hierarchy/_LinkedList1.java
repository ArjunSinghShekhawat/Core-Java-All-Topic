package collection_hierarchy;

import java.util.Arrays;
import java.util.LinkedList;

public class _LinkedList1 {
    public static void main(String[] args) {

        //LinkedList

        //1.Internally used  doubly linked list data structure
        //2.index base accessing is not allowed
        //3.access the element take more time linear time
        //4.add and remove element take less time constant time
        //5.not synchronised
        //6.not thread safe
        //7.preserved order of insertion
        //8.mutable in nature
        //9.more memory consumption
        //10.implement list and deque interface
        //11.allowed duplicates value


        LinkedList<Integer>list = new LinkedList<>();

        list.addFirst(12);
        list.add(54);
        list.add(76);
        list.add(1,65);
        list.add(87);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.isEmpty());
        System.out.println(list.contains(21));
        System.out.println(list.containsAll(Arrays.asList(21,34)));
        System.out.println(list.indexOf(21));
        System.out.println(list.lastIndexOf(32));
        list.set(1,43);

        System.out.println(list);

        list.remove(1);
        list.remove(Integer.valueOf(21));
        list.removeIf(data->data.equals(31));
        list.removeAll(Arrays.asList(54,65));

        System.out.println(list);

        LinkedList<String>names = new LinkedList<>();
        names.add("arjun");
        names.add("manjeet");
        names.add("jay");
        names.add("kishan");

        System.out.println(names);
        names.add(null);
        names.add(null);

        System.out.println(names);
    }
}
