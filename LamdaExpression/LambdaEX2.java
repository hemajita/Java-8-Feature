package LamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEX2 {
    public static void main(String[]args){
        FuncInterface funcInterface=(int x)->System.out.println(2*x);
        funcInterface.m1(10);
    }
}
interface FuncInterface{
    void m1(int x);
    default  void m2(){
        System.out.println("Hello");
    }
}
