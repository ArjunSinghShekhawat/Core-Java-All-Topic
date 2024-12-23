package collection_hierarchy;

import java.util.EnumSet;

enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,FRIDAY,SATURDAY
}
public class _EnumSet1 {
    public static void main(String[] args) {
        EnumSet<Days>days =EnumSet.allOf(Days.class);

        System.out.println(days);
    }
}
