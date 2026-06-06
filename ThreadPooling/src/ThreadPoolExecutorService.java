import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    int taskNumber;
    Task(int taskNumber){
        this.taskNumber=taskNumber;
    }
    public void run(){
        System.out.println("Task Number "+taskNumber+" Performed by "+ Thread.currentThread().getName());
    }
}
class ThreadPoolExecutorService{
    public static void main(String []args){
        ExecutorService exe= Executors.newFixedThreadPool(2);

       Task x=new Task(1);
        Task x1=new Task(2);
        Task x2=new Task(3);
        Task x3=new Task(4);

        exe.submit(x);
        exe.submit(x1);
        exe.submit(x2);
        exe.submit(x3);


        exe.shutdown();
    }
}