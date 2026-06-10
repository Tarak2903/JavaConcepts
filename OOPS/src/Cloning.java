class Students implements Cloneable{
    int id;
    Students(int id){
        this.id=id;
    }

    public Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }

}
public class Cloning {
    public static void main(String []args){
        Students s1 =new Students(1);
        Students s2=s1;
        //here s1 and s2 point to same memory in heap
    }
}


//Cloneable is a Marker Interface
/*
1. Allocate memory for a new object

2. Copy all field values from old object

3. Return the new object
 */