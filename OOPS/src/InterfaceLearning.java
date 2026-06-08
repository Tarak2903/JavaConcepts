interface Bird{
    void fly();
    int count=200;
     default void eat(){
        logger();
    }
    static void info(){
        System.out.println("Hello i am  a static method");
    }

    private void logger(){
        System.out.println("This is a helper functions that will print us helping");
    }

}

//interface Birdie implements Bird{
//
//}  ----> Not possible as interface cannot implement interface

interface Birdie extends Bird{
    void flyer();
} //  ------>Correct this can be done


// This should be implementing both the functions as Birdie has extended the interface


class Ostricher implements Bird,Birdie{
    public void fly(){}// It should always be public remember that
    public void flyer(){}

}

class Ostrich implements Bird{
   public void fly(){
        System.out.println("I am flying");
    }
}
public class InterfaceLearning{
     static void main(String []args){
            Bird b= new Ostrich();
            b.eat();
            b.fly();
            Bird.info();

         System.out.println(Birdie.count);// I can access static data member for its parent interface
    }
}

// Methods inside Interface

//1. Simple methods are by default abstract as is the fly in this code
//2. Default methods which allows the method to have a body
//3. static method which can be called by interface name example info() methods in this code
//4. Private methods which can also contain the body they act as helper to default functions many times


// Data Members in Interface
// They are by default static final



//Types of Interfaces
// 1.Functional Interface -> Have exactly one abstract method
// 2.Marker Interface -> No abstract  method
// 3.Simple interface which can have each and everything

