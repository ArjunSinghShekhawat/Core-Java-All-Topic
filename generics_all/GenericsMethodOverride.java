package generics_all;

interface Human<K,V>{
    void displayNameOfHuman(K key,V value);
}
class Arjun<K,V> implements Human<K,V>{

    @Override
    public void displayNameOfHuman(K key, V value) {
        System.out.println(key+" :"+value);
    }
}
public class GenericsMethodOverride {
    public static void main(String[] args) {
        Arjun<String,String>arjun = new Arjun<>();
        arjun.displayNameOfHuman("Name"," Arjun Singh");
    }
}
