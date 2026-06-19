class Database {

    private int readerCount = 0;
    private boolean writerPresent = false;

    public synchronized void startRead()
            throws InterruptedException {

        while(writerPresent){
            wait();
        }

        readerCount++;
    }

    public synchronized void endRead(){

        readerCount--;

        if(readerCount == 0){
            notifyAll();
        }
    }

    public synchronized void startWrite()
            throws InterruptedException {

        while(writerPresent || readerCount > 0){
            wait();
        }

        writerPresent = true;
    }

    public synchronized void endWrite(){

        writerPresent = false;

        notifyAll();
    }
}
class Main{
    public static void main(String []args){

    }
}