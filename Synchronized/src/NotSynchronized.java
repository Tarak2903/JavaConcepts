import java.util.concurrent.locks.ReentrantLock;

class Counter{

    int counter=0;
    ReentrantLock lock =new ReentrantLock();
     void increment(){
         lock.lock();
         try{
             counter++;
         }
         finally{
             lock.unlock();
         }

    }
}
class MyThread extends Thread{
    Counter c;
    MyThread(Counter c){
        this.c=c;
    }
    public void run(){
      for(int i=0;i<1000;i++){
          c.increment();
      }
    }
}

class Main{
    public static void main(String []args) throws InterruptedException {
        Counter c= new Counter();
        MyThread t1=new MyThread(c);
        MyThread t2=new MyThread(c);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.counter);

    }
}