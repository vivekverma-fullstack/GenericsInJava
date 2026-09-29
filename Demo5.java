public class Demo5 {
    public static void main(String[] args) {
        Integer x  = 4;
        System.out.println(x.doubleValue());       // 4.0
        // Box<String> a = new Box<>("Vivek");    Bound missmatch  --CompileTimeError
        Box<Integer> b = new Box<>();
        b.value = 10;
        b.getValue();
    }
}
//Bounds in Generics --Upper Bound    Number is tha SuperClass of Integer, Float, Double, Byte.
class Box<T extends  Number> {
    T value;
    public void getValue(){
        System.out.println(value.doubleValue());
    }
}
// Integer , Double, Float, Byte  --- All these Classes extends Number Class 


