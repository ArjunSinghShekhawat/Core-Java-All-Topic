package collection_hierarchy;

import java.util.LinkedList;
import java.util.Stack;

public class _Stack1 {
    public static void main(String[] args) {

        //Stack

        //Stack extent the vector
        //stack is synchronised
        //thread safe
        //internally used dynamic array
        //index base accessing
        //slow as compare arraylist and linked list
        //push,pop and peek methods are used
        //

        Stack<Integer>stack = new Stack<>();

        stack.add(12);
        stack.add(65);
        stack.add(87);
        stack.add(23);
        stack.add(89);
        stack.add(12);
        stack.add(65);
        stack.add(87);
        stack.add(23);
        stack.add(89);
        stack.add(43);

//        System.out.println(stack);
//        System.out.println(stack.capacity());
//        System.out.println(stack.indexOf(21));

        System.out.println(stack.search(21));
        System.out.println(stack.peek());

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

        LinkedList<Integer>list = new LinkedList<>();

        list.addFirst(21);
        list.addFirst(32);
        list.addFirst(65);
        list.addFirst(87);
        list.addFirst(98);

        System.out.println();
        while (!list.isEmpty()){
            System.out.print(list.removeLast()+" ");
        }


    }
}
