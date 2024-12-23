package collection_hierarchy;


import java.util.*;

class _Student {
    private String name;
    private int id;

    public _Student(String name,int id){
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
        return "_Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
class CustomComparator implements Comparator<_Student>{

    @Override
    public int compare(_Student o1, _Student o2) {
//        return o1.getId()-o2.getId();
        return o1.getName().compareTo(o2.getName());
    }
}
public class _Comparator {
    public static void main(String[] args) {

        //Comparator is a functional interface, It is used for provide custom sorting techniques and available in java.util package.
        //Comparator provide multiple sorting sequence and does not effects on the sorting  class


        _Student student1 = new _Student("arjun",3);
        _Student student2 = new _Student("ankit",1);
        _Student student3 = new _Student("anshu",2);
        _Student student4 = new _Student("keshav",4);
        _Student student5 = new _Student("binash",4);

        List<_Student>studentList = Arrays.asList(student1,student2,student3,student4,student5);



//        studentList.sort(new CustomComparator());
//
//        System.out.println();
//        for(_Student student:studentList){
//            System.out.println(student);
//        }


        Comparator<_Student> studentComparator = Comparator.comparing(_Student::getId).thenComparing(_Student::getName);
        studentList.sort(studentComparator);

        for(_Student student:studentList){
            System.out.println(student);
        }




    }
}
