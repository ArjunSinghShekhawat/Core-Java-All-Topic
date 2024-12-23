package collection_hierarchy;

import java.util.EnumMap;
import java.util.HashMap;

enum Day{
    SUNDAY,MONDAY,TUESDAY,WENDESDAY,THRESDAY,FRIDAY,SATURDAY;
}
public class _EnumMap1 {
    public static void main(String[] args) {

        HashMap<Day,Integer>map = new HashMap<>();

        EnumMap<Day,Integer>days = new EnumMap<>(Day.class);

        days.put(Day.WENDESDAY,3);
        days.put(Day.THRESDAY,4);
        days.put(Day.SUNDAY,0);
        days.put(Day.MONDAY,1);
        days.put(Day.TUESDAY,2);
        days.put(Day.FRIDAY,5);
        days.put(Day.SATURDAY,6);


        System.out.println(days);
    }
}
