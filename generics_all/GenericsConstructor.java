package generics_all;

class Student{
    public <K,V> Student(K key,V value){
        System.out.println(key+" "+value);
    }
}
public class GenericsConstructor {
    public static void main(String[] args) {

        Student student = new Student("Age ",21);

    }
}
