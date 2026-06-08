class Animal{
    Animal(String message){
        System.out.println("Animal is called");
    }
}
class Dog extends Animal{
    Dog(){
        super("Hello");
        System.out.println("Dog is called");
    }
}
class Lab extends Dog{
    Lab(){
        System.out.println("Labarador");
    }
}


public class Class {
    public static void main(String []args){
        Animal x= new Lab();
    }
}


/*
Super or this always go first
When ever there is inheritance
1. Parent's constructor is called then child top-down approach goes

Whenever there is parameterized constructor in Parent class child class must use
super(data) in other wise it would give error


 */