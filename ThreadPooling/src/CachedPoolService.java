import java.util.concurrent.*;

class Perimeter implements Callable<Integer>{
    int a,b;
    Perimeter(int a,int b){
        this.a=a;
        this.b=b;
    }
    public Integer call() throws InterruptedException{
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(1000);
        return a+b;
    }
}

public class CachedPoolService  {
    public static void main(String []args) throws InterruptedException, ExecutionException {
        ExecutorService exe= Executors.newCachedThreadPool();
        Perimeter a=new Perimeter(1,2);
        Perimeter b=new Perimeter(1,2);
        Perimeter c=new Perimeter(1,2);
        Perimeter d=new Perimeter(1,2);

        Future<Integer> f1= exe.submit(a);
        Thread.sleep(1000);
        Future<Integer> f2= exe.submit(b);
        Thread.sleep(1000);
        Future<Integer> f3= exe.submit(c);
        Thread.sleep(1000);
        Future<Integer> f4= exe.submit(d);
        exe.shutdown();
    }

}
