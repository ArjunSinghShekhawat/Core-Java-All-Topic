package collection_hierarchy;

import com.sun.source.tree.Tree;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class _TreeSet1 {
    public static void main(String[] args) {

//        SortedSet<Integer>set = new TreeSet<>();
//
//        set.add(1);
//        set.add(2);
//        set.add(5);
//        set.add(3);
//        set.add(4);
//
//        System.out.println(set);
//        System.out.println(set.headSet(3));
//        System.out.println(set.tailSet(3));
//        System.out.println(set.subSet(2,4));
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());

//        NavigableSet<Integer> set = new TreeSet<>();
//
//        set.add(1);
//        set.add(2);
//        set.add(5);
//        set.add(3);
//        set.add(4);
//
//        System.out.println(set);
//        System.out.println(set.floor(3));
//        System.out.println(set.ceiling(2));


        TreeSet<Integer> set = new TreeSet<>();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(4);

        System.out.println(set);
        System.out.println(set.headSet(3));
        System.out.println(set.tailSet(3));
        System.out.println(set.subSet(2,4));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.floor(3));
        System.out.println(set.ceiling(3));
    }
}
