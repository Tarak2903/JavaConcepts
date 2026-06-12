import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ArrayList1{
    public static void main(String[] args){

        List<Integer> x = new ArrayList<>();

        x.add(1);
        x.add(3);
        if(x.contains(1)) System.out.println("1 is contained");

        List<Integer>y= new ArrayList<>();
        y.add(20);

        x.addAll(1,y);

        Iterator<Integer> it =x .iterator();

        while(it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        Iterator<Integer> it2= x.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }



    }
}