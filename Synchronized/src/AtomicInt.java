import java.util.concurrent.atomic.AtomicInteger;

class  Counter1{
//    public volatile int counter=0;
    AtomicInteger counter= new AtomicInteger(0);
    public void increment(){counter.incrementAndGet();}
}
class Mythread1 extends Thread{
    Counter1 c;
    Mythread1(Counter1 c){this.c=c;}
    public void run(){
        for(int i=0;i<10000;i++){
            c.increment();
        }
    }

}
public class AtomicInt {
    static void main(String[] args)throws InterruptedException{
        Counter1 c=new Counter1();
        Mythread1 t1=new Mythread1(c);
        Mythread1 t2=new Mythread1(c);

        t1.start();
        t2.start();
        Thread.sleep(4000);
        System.out.println(c.counter.get());

    }
}
