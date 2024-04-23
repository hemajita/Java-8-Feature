package LamdaExpression;

public class EvenOdd {

    public static void main(String[]args){
      A a=  (n)->(n%2)==0;
      if (a.func(11))
          System.out.println("even");
      else
          System.out.println("odd");
    }
}
interface A{
    boolean func(int n);
}
