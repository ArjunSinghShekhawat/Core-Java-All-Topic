package generics_all;

//Generics Class
class Addition<T extends Number,T1 extends Number>{
    T val1;
    T1 val2;

    public Addition(T val1,T1 val2){
        this.val1=val1;
        this.val2=val2;
    }
    public void add(){
        System.out.println("Addition of "+val1+" and "+val2+" will be "+(val1.doubleValue()+val2.doubleValue()));
    }
}
public class GenericsClass {
    public static void main(String[] args) {

        Addition<Float,Float>addition1 = new Addition<>(12.45f,45.65f);
        addition1.add();

        Addition<Integer,Integer>addition2 = new Addition<>(12,45);
        addition2.add();
    }
}
