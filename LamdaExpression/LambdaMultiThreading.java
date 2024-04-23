package LamdaExpression;

public class LambdaMultiThreading {
    public void run(){
        System.out.println("hello");
    }
    public static void main(String[]args) {
        Runnable myThread = () -> {
            Thread.currentThread().setName("MAMA");
System.out.println(Thread.currentThread().getName());
        };
        Thread th=new Thread(myThread);
        th.start();
    }
}
