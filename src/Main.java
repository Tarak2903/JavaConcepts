class MyThread extends Thread{
    public void run(){

        for(int i=0;i<3;i++){
            System.out.println("Hello");


        }
    }

}

class Main{
    public static void main(String []args){

        MyThread thread=new MyThread();
        thread.run();
    }
}