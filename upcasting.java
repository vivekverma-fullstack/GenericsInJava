public class upcasting{
    public static void main(String[] args) {
    String s = "Hello";
    Object obj = s;      //upCasting
    System.out.println(obj);
    int x = 10;
    long l = x;         //upcasting
    System.out.println(l);
    Object obj1 = "Hello";
    String s1 = (String)obj1;    //downcasting
    System.out.println(s1);
    Object obj2 = 10;   //int
    String s2 = (String)obj2;      // throw classcastExpection 
    System.out.println(s2);

}
}