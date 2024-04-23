package LamdaExpression;

public class LambdaMultiThreading1 {
    public static void main(String[]args){
     Runnable runnable=()->{
         String threadname=Thread.currentThread().getName();
         System.out.println("Running common task by"+threadname);
     };
     Thread thread=new Thread(runnable);
     Thread thread1=new Thread(runnable);
     thread.start();
     thread1.start();
    }
}
