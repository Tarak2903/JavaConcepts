class Animal1 {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Barking");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal1 a = new Dog1();

        a.eat();
    }
}