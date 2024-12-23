package collection_hierarchy;

import java.util.Arrays;
import java.util.List;

class __Student implements Comparable<__Student>{
    private String name;
    private int id;

    __Student(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "__Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(__Student o) {
        return this.name.compareTo(o.getName());
    }
}
public class _Comparable1 {
    public static void main(String[] args) {

        //Comparable -: is a functional interface , it is available in the lang package.It is provide custom single sorting sequence.
        //it does affect on the original class.


        __Student student1 = new __Student("arjun",1);
        __Student student2 = new __Student("jay",4);
        __Student student3 = new __Student("vikash",3);
        __Student student4 = new __Student("suresh",2);
        __Student student5 = new __Student("bob",5);

        List<__Student>list = Arrays.asList(student1,student2,student3,student4,student5);


        list.sort(null);

        for(__Student student:list){
            System.out.println(student.getId()+" "+student.getName());
        }




    }
}
