/*
IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!

VARIABLES ARE TAKEN INTO ACC BY REFERENCE TYPE NOT  OBJECT TYPE

FOR EG

Animal a= new Dog();

here a.x will print the x of  Animal
 */

class Parent{
    Parent(){
        show();
    }

    void show(){
        System.out.println("Hello i am Parent");
    }
}
class Child extends Parent{
    int x;
    Child(int x){
        this.x=x;
    }
    void show(){
        System.out.println("Hello is my name is "+x);
    }
}

public class ParentMemory {
     static void main(String []args){
         System.out.println("Tarak is my name");
         Child x= new Child(10);
         System.out.println(x.x);
    }
}

//Here the method overriding that i am doing is called dynamic dispatch
