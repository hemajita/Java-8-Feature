package LamdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEX4 {
    public static void main(String[] args)
    {
        List<Integer> al= Arrays.asList(10,20,1,20,90,14,52,34,70);
        System.out.println("before sorting"+al);
        //desending order
        Collections.sort(al,(o1,o2)->(o1>o2) ? -1:(o1>o2) ?1:0);
        System.out.println("after sorting"+al);
        //ascending order
        Collections.sort(al,(o1,o2)->(o1<o2) ? -1:(o1>o2) ?1:0);
        System.out.println("after sorting"+al);
    }
}
