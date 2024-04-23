package LamdaExpression;

import java.util.ArrayList;

public class LambdaEX1 {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(14);
        arr.add(10);
        arr.add(18);
        arr.add(15);
        arr.add(11);
        arr.add(13);

        arr.forEach(n->System.out.println(n));
//for even number
        arr.forEach(n->{if (n%2==0)
        System.out.println(n);
        });
//for odd number
        arr.forEach(n->{if ((n%2)!=0)
            System.out.println(n);
        });

    }
}
