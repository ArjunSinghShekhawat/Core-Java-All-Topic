package generics_all;

//Generics Interface
interface ShowInformationDetails<T>{
    void displayDetails(T message);
    T getDetails();
}
public class GenericsInterface {

    public static void main(String[] args) {

        //Anonymous Class
        ShowInformationDetails<String>showInformationDetails = new ShowInformationDetails<String>() {

            String message;
            @Override
            public void displayDetails(String message) {
                System.out.println("Information Details is "+message);
                this.message=message;
            }

            @Override
            public String getDetails() {
                return message;
            }
        };

        showInformationDetails.displayDetails("hy arjun how are you !");
        System.out.println(showInformationDetails.getDetails());
    }
}
