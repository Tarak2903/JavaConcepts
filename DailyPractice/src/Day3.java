import java.util.List;

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
}

public class Day3 {
}
