package LamdaExpression;

public class LambdaFactorial {
    public static void main(String[]args){
        Func func=(n)->{
            int res=1;
            for(int i=1;i<=n;i++){
                res=i*res;
            }
            return res;
        };
        System.out.println("Factorial of 5 :"+func.fact(5));
    }
}
interface Func{
    int fact(int n);
}
