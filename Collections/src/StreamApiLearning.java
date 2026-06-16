import java.util.ArrayList;
import java.util.List;

public class StreamApiLearning {
    void main(){
        List<Integer> ls = new ArrayList<>(List.of(1,2,3,4,5,6,7));

        ls.stream().
                filter(x->x%2==0).
                map(x->x*x)
                .forEach(System.out::println);

        // If someone is using its completely discard and does not move down the stream at all

        long count=ls.stream().
                filter(x->x%2==0)
                .count();


        int val= ls.stream()
                .reduce(1,(a,b)->a*b);


        ls.stream().
                min((a,b)->Integer.compare(a,b))
                .ifPresent(System.out::println);
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