package generics_all;

import java.util.ArrayList;
import java.util.List;

interface Animal{
    void speak();
}
class Cat{
    void displayAnimalName(){
        System.out.println("cat");
    }
}
class Dog extends Cat implements Animal{
    void displayAnimalName(){
        System.out.println("dog");
    }
    @Override
    public void speak() {
        System.out.println("Bhou bhou...");
    }
}
class Category extends Dog implements Animal{
}
class Animals<T extends Dog & Animal>{
    public void display(){
        System.out.println("Cat , Dog , All Animals");
    }
}
public class BoundConcept {
    public static void main(String[] args) {
        //Upper bound  -> used extends
        //lower bound  -> used super

        Animals<Category>animals =new Animals<>();
        animals.display();

        List<? extends Number>list1 = new ArrayList<>();
        List<? super Number>list2 = new ArrayList<>();
    }
}
