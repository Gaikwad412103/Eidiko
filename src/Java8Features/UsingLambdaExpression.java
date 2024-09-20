package Java8Features;

public class UsingLambdaExpression {
    public static void main(String[] args) {
        //-------------------Using LambdaExpression----------------------
        Runnable runnable=()->{
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread()+" "+i);
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
