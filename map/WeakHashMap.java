package map;

import java.util.Map;

class Student{
    private final String name;
    private final int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class WeakHashMap {
    public static void main(String[] args) {

        //automatically removed entry when key is not longer used
        //used where key as a weak reference
        //used in caching
        //not synchronized ad thread safe
        java.util.WeakHashMap<String,Student>map = new java.util.WeakHashMap<>();

        computation(map);
        System.out.println("Before \n"+map);
        System.gc();
        waiting();
        System.out.println("After \n"+map);

        /*
         * OUTPUT--:

           Before
           {CSE001=Student{name='arjun', age=21}}
           After
           {}

         */
    }
    public static void computation(Map<String,Student> information){
        Student student1 = new Student("arjun",21);
        Student student2 = new Student("arjun",21);

        String idNumber1 = new String("CSE001");
        String idNumber2 = new String("CSE001");

        information.put(idNumber1,student1);
        information.put(idNumber2,student2);
    }
    public static void waiting(){
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
