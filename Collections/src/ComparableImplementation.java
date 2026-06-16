import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car> {
    String name;
    Car(String name){
        this.name=name;
    }
    String getId(){
        return name;
    }

    @Override
    public int compareTo(Car o) {
       return  this.name.compareTo(o.name)  ;
    }
}

public class ComparableImplementation {

    void main(){

        List<Car> ls= new ArrayList<>();
        ls.add(new Car("Tarak"));
        ls.add(new Car("Abhay"));
        ls.add(new Car("Aastha"));

        Collections.sort(ls) ;//ClassCastException

        for(Car s: ls){
            System.out.println(s.getId()+" ");
        }
    }

}
