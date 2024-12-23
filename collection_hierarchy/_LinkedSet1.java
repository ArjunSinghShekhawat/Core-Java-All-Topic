package collection_hierarchy;

import java.util.LinkedHashSet;

public class _LinkedSet1 {
    public static void main(String[] args) {

        LinkedHashSet<Integer>list = new LinkedHashSet<>(10,0.75f);


        list.add(21);
        list.add(43);
        list.add(12);
        list.add(76);
        list.add(90);

        System.out.println(list);
    }
}
