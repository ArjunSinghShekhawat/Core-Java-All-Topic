package generics_all;

class Notification{
    public <K,V> void notify(K key,V value){
        System.out.println("Notification");
        System.out.println(key+" "+value);
    }
}
public class MethodGenerics {
    public static void main(String[] args) {
        Notification notification = new Notification();
        notification.notify("CodeHelp    --->  ","Data Structure And Algorithm Course available only 2100 rs");
    }
}
