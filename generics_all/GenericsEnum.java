package generics_all;

enum Operations{
    ADD,SUB,MUL,DIV;

    public <T extends Number,T1 extends Number> void performOperation(T val1,T1 val2){
        switch (this){
            case ADD -> System.out.println("Add "+(val1.doubleValue()+val2.doubleValue()));
            case SUB -> System.out.println("Sub "+(val1.doubleValue()-val2.doubleValue()));
            case MUL -> System.out.println("Mul "+(val1.doubleValue()*val2.doubleValue()));
            case DIV -> System.out.println("Div "+(val1.doubleValue()/val2.doubleValue()));
            default -> System.out.println("Default value");
        }
    }
}
public class GenericsEnum {
    public static void main(String[] args) {
        Operations.ADD.performOperation(21,44);
        Operations.MUL.performOperation(21,44);
        Operations.DIV.performOperation(21,44);
        Operations.SUB.performOperation(21,44);
    }
}
