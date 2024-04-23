package LamdaExpression;

public class LambdaEX3 {
    static void fun(ClassA c,int p1,int p2){
        c.print(p1,p2);
    }
    public static void main(String[]args){
        fun((p1,p2)->System.out.println(p1+ " " +p2),10,20);
    }
}
interface ClassA{
    void print(int p1,int p2);
}
