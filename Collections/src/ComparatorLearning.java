import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class School{
    int rank;
    String name;

    School(int rank,String name){
        this.rank=rank;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public int getRank(){
        return this.rank;
    }

}
class IntegerSortLearning{

    public void hello(){
       List<Integer> ls = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        System.out.println("From here i am printing using the IntegerSortLearningClass");

       ls.sort( (a,b)->{
           return b-a;
       });

        for(Integer i: ls){
            System.out.print(i+" ");
        }


    }
}

public class ComparatorLearning {

    void main() {
        IntegerSortLearning x= new IntegerSortLearning();

        List<School> ls = new ArrayList<>();
        ls.add(new School(700, "MASD"));
        ls.add(new School(2,"SDVM"));

       ls.sort((a,b)-> {
                   if (a.rank != b.rank) {
                     return  a.rank - b.rank;
                   }
                  return  a.name.compareTo(b.name);
               }
       );

       for(School s: ls){
           System.out.println(s.getName()+" "+s.rank);
       }

        x.hello();
    }
}
