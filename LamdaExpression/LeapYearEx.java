package LamdaExpression;

public class LeapYearEx {
    public static void main(String[]args){
       Test t=(year)->{
           if((year%400==0)||(year%4==0)&&(year%100!=0))
               return true;
           else return false;
       } ;
       if (t.test(2020))
           System.out.println("leap year");
       else
           System.out.println("not a leap year");
    }
}
interface Test{
    boolean test(int n);
}