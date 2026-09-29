public class Demo3{
    public static void main(String[] args) {
        Box<Integer, String> box = new Box<>(21, "Vivek");
        System.out.println(box.getName() + 5);
        System.out.println(box.getRollno() + 5);
    }
}
class Box<T, V>{
        private T Rollno;
        private V name;

        Box(T Rollno, V name){
            this.Rollno = Rollno;
            this.name = name;
        }
        T getRollno(){
            return Rollno;
        }
        V getName(){
            return name;
        }
}