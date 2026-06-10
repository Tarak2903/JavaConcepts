class Car{
    private String model="BMW";

    class Engine{
        void show(){
            System.out.println(model);// Inner class can even access private data methods
            //If this is the engine it cannot be accessed
        }


    }
}

public class InnerClass {
    public static void main(String []args){
    Car c = new Car();

    Car.Engine x= c.new Engine();
    x.show();
    }
}
