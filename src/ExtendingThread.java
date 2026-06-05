class MyThread extends Thread{
    public void run(){

        for(int i=0;i<3;i++){
            System.out.println("Hello");
            try{
            Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class ExtendingThread{
    public static void main(String []args){

        MyThread thread=new MyThread();
        thread.start();
    }
}