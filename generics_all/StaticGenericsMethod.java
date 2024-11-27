package generics_all;

public class StaticGenericsMethod {
    public static <T> void printInformation(T message){
        System.out.println("Information "+message);
    }
    public static void main(String[] args) {
        printInformation("hello arjun");

    }
}
