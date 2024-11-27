package generics_all;

import java.util.ArrayList;
import java.util.List;

//Generics Basic
public class GenericsBasic {
    public static void main(String[] args) {

        /**
           GENERICS IS A WAY TO CREATE CLASS,INTERFACE,CONSTRUCTOR,METHOD THAT OPERATE ON THE TYPE SPECIFIED BY THE DEVELOPER.
           Generics -: Generics specify which type of values are store inside the collection framework.

           BENEFITS OF GENERIS
           1.Provide type safety at compilation time
           2.Prevent explicit type conversion
           3.and provide code re-usability
           4.Provide more flexibility to work on multiple type of data without creating multiple version of the class.
         */

        List list = new ArrayList();
        list.add(12);
        list.add("arjun");
        list.add(12.43f);

        String name = (String)list.get(1);//required explicit type casting
        System.out.println("Name "+name);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(45);
        list1.add(78);
        Integer value = list1.get(1);//not required explicit type casting
        System.out.println(value);
        System.out.println(list1);

    }
}
