import java.util.List;
import java.util.concurrent.Callable;

class Order{
    int orderId;
    String customerName;
    double amount;

    Order(int orderId,String customerName,double amount){
        this.orderId=orderId;
        this.customerName=customerName;
        this.amount=amount;
    }

    public int getOrderId(){return  orderId;}
    public  String getCustomerName(){return  customerName;}
    public  double getAmount(){return amount;}

    public String toString(){
        return customerName+" "+orderId+" "+amount;
    }
}
class OrderProcessor{

    public  List<Order> ls;
    public  synchronized void  add(Order o){
        ls.add(o);
    }
}

class OrderTask implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 0;
    }
}



public class Day3 {
}
