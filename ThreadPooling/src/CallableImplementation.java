import java.util.concurrent.*;

class Area implements Callable<Integer>{
    int a,b;
    Area(int a,int b){
        this.a=a;
        this.b=b;
    }
    public Integer call(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return a*b;
    }
}
public class CallableImplementation  {
    public static void main(String []args) throws InterruptedException,ExecutionException {
        ExecutorService exe = Executors.newFixedThreadPool(2);
        Area x = new Area(10, 2);
        Future<Integer> ans = exe.submit(x);
        System.out.println(ans.isDone());
        Thread.sleep(4000);
        System.out.println(ans.isDone());
        System.out.println(ans.get());

        exe.shutdown();
    }
}
