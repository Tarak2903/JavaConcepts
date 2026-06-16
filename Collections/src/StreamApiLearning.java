import javax.crypto.AEADBadTagException;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiLearning {
    void main(){
        List<Integer> ls = new ArrayList<>(List.of(1,2,3,4,5,6,7,7));

        ls.stream().
                distinct()
                .forEach(System.out::print);

        // If someone is using its completely discard and does not move down the stream at all


        //FIND EVEN NUMBERS IN A STREAM
        long count=ls.stream().
                filter(x->x%2==0)
                .count();

        //Find Product of all Elements in a Stream
        int val= ls.stream()
                .reduce(1,(a,b)->a*b);

        //Find minimum in a Stream
        ls.stream().
                min((a,b)->Integer.compare(a,b))
                .ifPresent(System.out::println);


        //Print first even number
        ls.stream()
                .filter(x->x%2==0)
                .findFirst()
                .ifPresent(System.out::println);

            List<Integer> ls2 = ls.stream()
                .filter(x->x%2==0)
                .toList();// This cannot be modified

        Set<Integer> st = ls.stream()
                                .collect(Collectors.toSet()); // collect method can be used and it will

        System.out.println("------------------");
        for(Integer i: st){
            System.out.print(i+" ");
        }
        List<String> words =  List.of("java","aws","spring","docker");

        Map<Integer, List<String>>mp=words
                .stream()
                .collect(
                        Collectors.groupingBy(
                                String::length
                        )
                );



    }

}


/*
3 types of Operation in Streams

1. Stream -> stream()

2. Intermediate Operations   ->
    filter(...)
    map(...)
    sorted(...)
    distinct(...)

3. Terminal Operations

    forEach(...)
    collect(...)
    count(...)
    findFirst(...)
    reduce(...)

NOTHING ACTUALLY EXECUTES BEFORE THE TERMINAL OPERATION THIS IS CALLED LAZY EVALUATION

 */