import java.util.HashSet;

class Student{
    int id;
    Student(int id){
        this.id=id;
    }
    /*
    Inorder to have unique student with unique id i need to make sure that i override both equals and hashCOde
     */
    public boolean equals(Object o){
        if(this==o)return true;

        if(!(o instanceof Student))return false;

        return this.id==((Student) o).id;
    }

    public int hashCode(){
        return id;
    }
}

public class HashSetImplementation {
    void main(){
        HashSet<Student> hashSet= new HashSet<>();

        hashSet.add(new Student(1));
        hashSet.add(new Student(1));



        System.out.println(hashSet.size());

    }
}





// HashSet implements the Set Interface
// HashSet uses Hashing + Buckets
