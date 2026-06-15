import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ListIteratorLearning{
    public void hello() {
        List<Integer> ls2 = new ArrayList<>();
        ls2.add(1);
        ls2.add(2);
        ls2.add(3);
        ls2.add(4);
        ls2.add(5);
        ListIterator<Integer> x= ls2.listIterator();
        while(x.hasNext()) {
           int z=x.next();
           x.set(z+1);
        }


       while(x.hasPrevious()){
           System.out.println(x.previous());
       }
    }
}
public class ArrayList1{
    public static void main(String[] args){

        ListIteratorLearning le=new ListIteratorLearning();
        le.hello();
      List<Integer> ls= new ArrayList<>();
      ls.add(1);
      ls.add(2);
      ls.add(3);
      ls.add(4);
      ls.add(5);
      Iterator<Integer> it = ls.iterator();

        while(it.hasNext()){
          if(it.next()%2==0){
              it.remove();
          }
        }

        Iterator<Integer>it2= ls.iterator();
//        while(it2.hasNext()){
//            System.out.println(it2.next()  );
//        }

    }
}

// Whenever inside a loop while iterating we perform some change int structure with methods such as
//insert remove or change the size then we will get the ConcurrentModification Exception