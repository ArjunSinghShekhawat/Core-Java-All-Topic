package collection_hierarchy;

import java.util.Enumeration;
import java.util.Vector;

public class _Vector1 {
    public static void main(String[] args) {

        //Vector

        //implement list interface
        //Internally used dynamic array
        //Initial capacity 10 and then accessed the initial capacity then double in size
        //synchronised in nature
        //thread safe
        //slow as compare arraylist and linked list
        //legacy class
        //provide index base accessing
        //add and remove operation take more time and access the element take less and constant time
        //allowed duplicates

        Vector<Integer>vector = new Vector<>(5,2);

        vector.add(12);
        vector.add(54);
        vector.add(65);
        vector.add(87);
        vector.add(65);
        vector.add(76);
        vector.add(76);

        System.out.println(vector.capacity());
        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.indexOf(21));
        System.out.println(vector.lastIndexOf(21));
        System.out.println(vector.isEmpty());
        System.out.println(vector.get(2));


        Enumeration<Integer> elements = vector.elements();

        while (elements.hasMoreElements()){
            System.out.print(elements.nextElement()+" ");
        }
    }
}
