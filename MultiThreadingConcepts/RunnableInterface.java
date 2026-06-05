class MyThreadOg implements Runnable{
    public void run(){

        for(int i=0;i<3;i++){
            System.out.println("Hello");

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class RunnableInterface {

public static void main(String []args){
    MyThreadOg thread=new MyThreadOg();
    Thread x= new Thread(thread);
    x.start();

}
}
