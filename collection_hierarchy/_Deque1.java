package collection_hierarchy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class _Deque1 {
    public static void main(String[] args) {
        //double ended queue
        Deque<String>names = new ArrayDeque<>();

        names.addFirst("arjun");
        names.addLast("manjeet");
        names.addLast("komal");
        names.addLast("aashu");
        names.addLast("nishu");

        System.out.println(names);

        System.out.println(names.getFirst());
        System.out.println(names.getLast());


        Deque<String>fruits = new LinkedList<>();

        fruits.addFirst("apple");
        fruits.addLast("bananna");
        fruits.addLast("date");
        fruits.addLast("mango");
        fruits.addLast("grapes");

        System.out.println(fruits);

        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());





    }
}
