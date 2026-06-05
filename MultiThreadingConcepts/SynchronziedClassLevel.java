class MyThreadSync extends Thread{
    Obj obj;
    MyThreadSync(Obj obj){
        this.obj=obj;
    }

    public  void run(){
        obj.print();
    }
}
class Obj{
    public static synchronized void print(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}

public class SynchronziedClassLevel {
    public static void main(String []args){
        Obj ob=new Obj();
        MyThreadSync t1=new MyThreadSync(ob);
        MyThreadSync t2=new MyThreadSync(ob);
        t1.start();
        t2.start();

    }

}
