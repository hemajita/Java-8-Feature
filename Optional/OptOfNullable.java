package Optional;

import java.util.Optional;

public class OptOfNullable {
    public static void main(String[]args){
        Optional<Integer> op1=Optional.ofNullable(1234);
        System.out.println(op1);

        Optional<Integer> op2=Optional.ofNullable(null);
        System.out.println(op2);
    }
}
