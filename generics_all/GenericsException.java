package generics_all;

class ResourceNotFoundException extends RuntimeException{
    public <T> ResourceNotFoundException(T exception){
        System.out.println("Exception "+exception);

    }
}
public class GenericsException {
    public static void main(String[] args) {

        try{
            throw new ResourceNotFoundException(new ArithmeticException("Divided By Zero"));
        }catch (ResourceNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
