package LamdaExpression;

public class LambdaEX5 {
    int n=120;
    public static void main(String[]args){
     LambdaEX5 lambdaEX5=new LambdaEX5();
   Ex ex=  ()->{
         System.out.println("number"+lambdaEX5.n);
       System.out.println("number"+lambdaEX5.n);
       lambdaEX5.n+=200;
     };
   ex.function();
   lambdaEX5.n+=300;
        System.out.println("number"+lambdaEX5.n);
    }
}

interface Ex{
    void function();
}