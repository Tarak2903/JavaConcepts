import java.util.LinkedList;

public class LinkedListLearning {
    void main(){
        LinkedList<Integer> ls = new LinkedList<>();

        ls.add(23);

        for(Integer i: ls){
            System.out.println(i);
        }

    }
}
//LinkedList  also implements Deque
