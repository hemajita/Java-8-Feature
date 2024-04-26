package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[]args){
        List<String> list= Arrays.asList("QA","DEV","BA","Support","Prod");
        Predicate<String> p=(s)->s.startsWith("P");
        for (String st:list){
            if (p.test(st)){
                System.out.println(st);
            }
        }
    }
}
