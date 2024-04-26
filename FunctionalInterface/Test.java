package FunctionalInterface;

public class Test {
    public static void main(String[]args){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("new thread created");
//            }
//        }).start();

        //using Lambdas
        new Thread(()->{
            System.out.println("thread created");
        }).start();
    }
}
