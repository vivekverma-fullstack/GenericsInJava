// Generics Methods-->

public class Demo4 {
    public static void main(String[] args) {
    //    Integer y = (Integer)getResult(10);
    //    System.out.println(y);
    //    String s = (String)getResult("Vivek Verma");
    //    System.out.println(s);
    // Integer y = getres(10);
    // System.out.println(y);
    // String s = getres("Vivek");
    // System.out.println(s);

    printsom(10, "Vivek");
    /*-----Type  inference---- */

    }
    public static  <T>T  getres(T x){     //---Type Perameter
        return x;
    }
    public static <x, y> void printsom(x X, y Y){
            System.out.println(X + " "+ Y);
    }
    public static Object getResult(Object x){
        return  x;
    }
    // public static int getName(int x){
    //     return x + 5;
    // }
}

// Generic Method
//<T>T methodName (T perameter) { 
//}
 