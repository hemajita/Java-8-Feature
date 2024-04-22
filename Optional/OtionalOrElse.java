package Optional;

import java.util.Optional;

public class OtionalOrElse {
    public static void main(String[]args){
        //Optional<Integer> op=Optional.of(57);
        Optional<Integer> op=Optional.empty();
        System.out.println(op);
        System.out.println(op.orElse(200));
    }
}
