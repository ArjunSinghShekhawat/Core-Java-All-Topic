package map;

enum Days{
    SUNDAY,MONDAY,TUESDAY,SATURDAY;
}
public class EnumMap {
    public static void main(String[] args) {

        //faster when you are used key as a enum because it is not required hashcode because index find with the ordinal method
        //it is faster and more efficient with compare another classes
        //know all possible keys in advance
        //generate arr with the size of the enum
        java.util.EnumMap<Days,String>map = new java.util.EnumMap<Days, String>(Days.class);

        map.put(Days.TUESDAY,"tuesday");
        map.put(Days.MONDAY,"monday");
        map.put(Days.SUNDAY,"sunday");
        map.put(Days.SATURDAY,"saturday");

        System.out.println(map);
    }
}
