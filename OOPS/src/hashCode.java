class Teacher{

    int id;
    Teacher(int id){
        this.id=id;
    }
//    @Override
//    public int hashCode(){
//        return id;
//    }
//
    public boolean equals(Object o){
        if(this==o)return true;
        if(! (o instanceof Teacher))return false;

        Teacher s= (Teacher) o;

        return this.id==s.id;

    }

}
public class hashCode {
    void main(){

        Teacher t1=new Teacher(1);
        Teacher t2=new Teacher(1);

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t1.equals(t2));// This will return false until i override the equals Method

    }
}

// Default implementation for equals() is return this==obj
