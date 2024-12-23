package collection_hierarchy;

import java.lang.ref.WeakReference;

class _Person{
    private int id;
    private String name;

    public _Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "_Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class _WeakReference1 {
    public static void main(String[] args) {

        WeakReference<_Person>personWeakReference = new WeakReference<>(new _Person(1,"arjun"));
        System.out.println(personWeakReference.get());
        System.gc();
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
        System.out.println(personWeakReference.get());

        //Weak Reference
        //Strong Reference


    }
}
