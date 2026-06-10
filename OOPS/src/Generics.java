class Box<T>{
    T value;
    void setValue(T value){
        this.value=value;
    }
    T getValue(){
        return value;
    }
}

public class Generics {
    public static void main(String []args){
        Box<String> b=new Box<>();
        b.setValue("Tarak");
        System.out.println(b.getValue());
    }
}
