class MyT1 extends Thread {
    Table tbl1;
    MyT1(Table tbl1){
        this.tbl1=tbl1;
    }
    public void run(){
        tbl1.print();
    }
}
class MyT2 extends Thread{
    Table tbl2;
    MyT2(Table tbl2){
        this.tbl2=tbl2;
    }
    public void run(){
        tbl2.print();
    }
}
class Table{
    public void print(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class SynchronizedClassLevel {

    public static void main(String []args){
        Table t= new Table();
        MyT1 t1=new MyT1(t);
        MyT2 t2=new MyT2(t);
        t1.start();
        t2.start();
    }

}
