class Student{
    int id;
    Student (int id){
        this.id=id;
    }
}
public class ObjectClass {
    public static void main(String []args){
        Student s1= new Student(1);
        Student s2=new Student(1);
//        System.out.println(s);
//        // outputs Student@8efb846 -> ClassName @HexDecimalCode


        System.out.println(s1.equals(s2));
        //For object default is comparing of reference that is why it shows false
    }
}




//Every Java class extends Object class implicitly
//toString() is a method whose purpose is to return a string representation of an object or value.
