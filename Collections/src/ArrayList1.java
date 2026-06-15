import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1{
    public static void main(String[] args){

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
        while(it2.hasNext()){
            System.out.println(it2.next()  );
        }

    }
}

// Whenever inside a loop while iterating we perform some change int structure with methods such as
//insert remove or change the size then we will get the ConcurrentModification Exception