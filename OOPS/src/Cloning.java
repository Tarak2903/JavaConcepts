class Students{
    int id;
    Students(int id){
        this.id=id;
    }
}
public class Cloning {
    public static void main(String []args){
        Students s1 =new Students(1);
        Students s2=s1;
        //here s1 and s2 point to same memory in heap
    }
}
