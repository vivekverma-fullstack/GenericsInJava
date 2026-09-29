public class Demo2 {
    public static void main(String[] args) {
        Box<Integer> b = new Box<Integer>(10);   //Tyep argument
        System.out.println(b.getValue()+5);
        Box<String> a = new Box<>("Vivek");
        System.out.println(a.getValue()+5);
    }
}
//Genrics

class Box<T>{      //Type Perameter 
    private T value;
    Box(T value){
        this.value = value;
    }
    public T getValue() {
        return this.value;
    }
   public  void setValue(T value) {
        this.value = value;
    }
}
//Type imformation is not Lost