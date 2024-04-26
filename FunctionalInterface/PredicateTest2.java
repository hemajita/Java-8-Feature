package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[]args){
        Predicate<Integer> greater=(i)->i>10;
        Predicate<Integer> lessthan=(i)->i<20;
        boolean result=greater.and(lessthan).test(15);
        System.out.println(result);
        boolean result2=greater.and(lessthan).test(25);
        System.out.println(result2);
    }
}
