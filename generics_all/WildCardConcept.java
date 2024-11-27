package generics_all;

import java.util.ArrayList;
import java.util.List;

//WildCardConcept only used when you are perform read operation;
public class WildCardConcept {
    public static void printList(List<?>list){
        list.forEach(data-> System.out.print(data+" "));
    }
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(12);
        list.add(32);
        list.add(67);
        list.add(78);
        list.add(90);
        printList(list);
    }
}
