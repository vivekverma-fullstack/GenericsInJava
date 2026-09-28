public class Demo1 {
    public static void main(String[] args) {
        // Box box = new Box(10);
        // Box box1 = new Box("Hello")  error--

        Box b1 = new Box("Hello");
        Box b2 = new Box(10);
        Box b3 = new Box(true);
        // System.out.println(b1.getValue()+5);

        //DownCasting
        String s = (String) b1.getValue();
        int i = (int) b2.getValue();
        Boolean b = (boolean) b3.getValue();

        System.out.println(s + 5);
        System.out.println(i + 5);
        System.out.println(b);
    }
} 

class Box{
    private Object value;
    Box(Object value){
        this.value = value;
    }
    public Object getValue() {
        return this.value;
    }
   public  void setValue(Object value) {
        this.value = value;
    }
}
// class  Box {
//     private int value;
//     Box(int value){
//         this.value = value;
//     }
//      void setValue(int value){
//         this.value = value;
//      }
//      int getValue(){
//         return this.value;
//      }
// }
// class Box1{
//     String value;
// }
// class Box2{
//     boolean value;
// }