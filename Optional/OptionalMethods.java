package Optional;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[]args){
        String[] str=new String[10];
        str[5]=" Java Optional methods";
        // It returns an empty instance of Optional class
        Optional<String> empty=Optional.empty();
        System.out.println(empty);
        Optional<String> value=Optional.ofNullable(str[5]);
        System.out.println(value);
        System.out.println("Getting value : "+value.get());
        System.out.println("Getting Value :" +value.hashCode());
    System.out.println("Is value present : "+value.isPresent());
    System.out.println("Nullable Optional + :" +Optional.ofNullable(str[5]));
System.out.println("orElse: "+value.orElse("value is not present"));
System.out.println("orElse: "+empty.orElse("value is not present"));
        System.out.println("Filtered value: "+value.filter((s)->s.equals("Abc")));

    }
}
