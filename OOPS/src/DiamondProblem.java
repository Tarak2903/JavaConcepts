interface hello1{
    default public void show(){
        System.out.println("Hello i am hello1");
    }
}
interface hello2{
    default public void show(){
        System.out.println("Hello i am hello2");
    }
}
class Diamond implements hello1,hello2{

    public void show(){
    hello1.super.show();
    }
}
public class DiamondProblem {
    public static void main(String []args){
        Diamond d= new Diamond();
        d.show();
    }

}
// this is how diamond problem can be solved