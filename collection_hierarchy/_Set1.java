package collection_hierarchy;

import java.util.HashSet;
import java.util.Set;

public class _Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(21);
        set.add(43);
        set.add(1);
        set.add(431);
        set.add(54);

        System.out.println(set);
        System.out.println(set.contains(54));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.hashCode());
        set.remove(1);
        set.removeIf(data->data.equals(22));

        System.out.println(set);

    }
}
