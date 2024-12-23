package collection_hierarchy;

import java.util.*;

public class _ArrayList1 {
    public static void main(String[] args) {

        //ArrayList

        //1.ArrayList implement list interface
        //2.Not Synchronized in nature
        //3.Not Thread safe
        //4.Index base accessing
        //5.Internally used dynamic array with internal capacity 10 and load factor 0.75f
        //6.mutable in nature
        //7.store duplicates
        //8.preserved order of insertion
        //9.add and remove take more time because shifting is required
        //10.access the element take less time


        List<Integer>list = new ArrayList<>();

        list.add(12);
        list.add(45);
        list.add(7);
        list.add(90);
        list.add(14);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(21));
        System.out.println(list.containsAll(Arrays.asList(2,54)));
        System.out.println(list.indexOf(45));
        System.out.println(list.lastIndexOf(34));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove(Integer.valueOf(90));
        list.remove(1);
        list.removeIf(obj->obj.equals(21));
        list.removeAll(Arrays.asList(2,43,76));

        System.out.println(list);

        List<Integer>list1 = new ArrayList<>(10);

        list1.add(12);
        list1.add(1,43);
        list1.addAll(list);

        System.out.println(list1);

        Integer[]arr = list1.toArray(new Integer[0]);

        for(Integer element:arr){
            System.out.print(element+" ");
        }

        list1.sort(null);
        System.out.println();
        System.out.println(list1);


        list1.set(1,101);
        System.out.println(list1);

        System.out.println(list1.hashCode());

        //iterator
        Iterator<Integer>iterator = list1.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        //immutable
        List<Integer> list2 = Collections.unmodifiableList(list1);
        System.out.println(list2);
//        list2.add(21);

        ArrayList<Integer>list3  = new ArrayList<>(Arrays.asList(4,3,12,3,6));

        list3.ensureCapacity(12);
//        System.out.println(list3.reversed());

        while (!list3.isEmpty()){
            System.out.print(list3.getLast()+" ");
            list3.removeLast();
        }
        list3.addAll(Arrays.asList(2,14,5,6,7));

        List<Integer> list4 = Collections.synchronizedList(list3);

        System.out.println();
        for(Integer data:list4){
            System.out.print(data+" ");
        }


    }
}
