class MyThreadSync1 extends Thread{
    Obj1 obj;
    MyThreadSync1(Obj1 obj){
        this.obj=obj;
    }

    public  void run(){
        obj.print();
    }
}
class Obj1{
    public   void print(){
        synchronized(this) {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
public class SynchronizedBlock {
    public static void main(String []args){
        Obj1 ob=new Obj1();
        MyThreadSync1 t1=new MyThreadSync1(ob);
        MyThreadSync1 t2=new MyThreadSync1(ob);
        t1.start();
        t2.start();

    }
}
