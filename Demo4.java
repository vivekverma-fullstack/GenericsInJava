// Generics Methods-->

public class Demo4 {
    public static void main(String[] args) {
    //    Integer y = (Integer)getResult(10);
    //    System.out.println(y);
    //    String s = (String)getResult("Vivek Verma");
    //    System.out.println(s);
    Integer y = getres(10);
    System.out.println(y);
    String s = getres("Vivek");
    System.out.println(s);

    }
    public static  <T>T  getres(T x){     //---Type Perameter
        return x;
    }
    public static Object getResult(Object x){
        return  x;
    }
    // public static int getName(int x){
    //     return x + 5;
    // }
}
