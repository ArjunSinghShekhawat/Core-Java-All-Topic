package collection_hierarchy;

import java.util.concurrent.CopyOnWriteArraySet;

public class _CopyOnWriteSet1 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String>set = new CopyOnWriteArraySet<>();

        set.add("apple");
        set.add("banana");
        set.add("mango");
        set.add("payaya");
        set.add("orange");

        System.out.println(set);

        for(String fruit:set){
            System.out.print(fruit+" ");
            if(fruit.equals("mango")){
                set.add("date");
            }
        }
        System.out.println();
        System.out.println(set);
    }
}
