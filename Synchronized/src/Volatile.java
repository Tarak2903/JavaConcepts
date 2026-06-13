import java.util.concurrent.*;

class Bo{
    public volatile boolean flag=false;
    public void setFlag(){
        flag=true;
    }
}

public class Volatile  {
    public static void main(String []args) throws InterruptedException, ExecutionException {
        Bo x= new Bo();
        ScheduledExecutorService exe= Executors.newScheduledThreadPool(2);

       Future<?> f1= exe.scheduleAtFixedRate(
                ()->{
                    while(!x.flag){
                    }
                    System.out.println("Hello"+Thread.currentThread().getName());
                    System.out.println("Exited the loop");
                },
                0,
                1,
                TimeUnit.SECONDS
        );
        exe.schedule(
                ()->{
                    x.setFlag();
                    System.out.println(Thread.currentThread().getName());
                },
                5,
                TimeUnit.SECONDS
        );

        Thread.sleep(40000);


        f1.get();
        exe.shutdown();

    }
}
//False Sharing STUDY!!!!! 