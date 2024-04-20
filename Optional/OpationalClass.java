package Optional;


import java.util.Optional;

public class OpationalClass {
public static void main(String[] args){
String[] str=new String[10];
//str[5]="Hello";
    Optional<String> checknull=Optional.ofNullable(str[5]);
if(checknull.isPresent()){
    String s=str[5].toLowerCase();
    System.out.println(s);
}
   else{
       System.out.println("String value is not present");
}
}
}
