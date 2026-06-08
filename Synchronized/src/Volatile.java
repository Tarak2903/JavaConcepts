import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Bo{
    public volatile boolean flag=false;
    public void setFlag(){
        flag=true;
    }
}

public class Volatile  {
    public static void main(String []args) throws InterruptedException {
        Bo x= new Bo();
        ScheduledExecutorService exe= Executors.newScheduledThreadPool(2);

        exe.scheduleAtFixedRate(
                ()->{
                    while(!x.flag){
                    }
                    System.out.println(Thread.currentThread().getName());
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



        exe.shutdown();

    }
}
