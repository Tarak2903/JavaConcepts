abstract class parent{
    abstract void print();
}
class child extends parent{
    void print(){
        System.out.println("Hello is my name");
    }
}

public class AbstractClass {
    public static void main(String []args){
        parent x=new child();
        x.print();
    }
}

// Either the abstract class should be one extending or it should contain the implementation of abstract function
