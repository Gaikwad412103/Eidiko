package Java8Features;

public class WithoutUsingLambdaExpression {
    public static void main(String[] args) {
        //-------------------Using Anomalous Class----------------------
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread()+" "+i);
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
