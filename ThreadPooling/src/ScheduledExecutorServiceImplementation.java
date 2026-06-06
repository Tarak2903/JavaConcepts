import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Pm {
    public void run(){
        System.out.println("Hello from "+ Thread.currentThread().getName());
    }

}
class Pm1{
    public void run(){
        System.out.println("Hello from pm1" + Thread.currentThread().getName());
    }
}
public class ScheduledExecutorServiceImplementation{

    public static void main(String []args) throws IllegalArgumentException,InterruptedException{
        ScheduledExecutorService exe= Executors.newScheduledThreadPool(2);
        Pm x= new Pm();
        Pm1 x1=new Pm1();
        exe.scheduleAtFixedRate(
                x::run,
                0,
                2,
                TimeUnit.SECONDS
        );
        exe.scheduleAtFixedRate(
                x::run,
                0,
                2,
                TimeUnit.SECONDS
        );
        exe.scheduleAtFixedRate(
                x1::run,
                0,
                2,
                TimeUnit.SECONDS
        );

        Thread.sleep(10000);

        System.out.println("Hello from "+ Thread.currentThread().getName());
        exe.close();


    }

}
