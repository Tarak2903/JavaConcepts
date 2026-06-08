import java.util.ArrayList;
import java.util.List;

//Array List is




class List1{
    public static void main(String []args){

        List<String> arr= new ArrayList<>();

       List<String> newarr= new ArrayList<>();

        newarr.add("Tarak");
        newarr.add("Harsh");
        newarr.add("Saurabh");

        arr.add("Tarak");
        arr.add("Harsh");
        arr.add("Saurabh");

        arr.addAll(1,newarr);

        System.out.println(arr.contains("Tarak"));


        for(String i: arr){
            System.out.print(i+" ");
        }

    }
}