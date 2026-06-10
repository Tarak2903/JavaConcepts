// Enums can implement interface but not extend the class


enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY;

    Day(){
        System.out.println("Constructor called");
    }
}


public class EnumLearning {
    public static void main(String []args){
        Day d= Day.MONDAY; // Constructor called thrice for each emum object
        System.out.println(d);
        Day[] x= Day.values();

        for(Day i: x){
            System.out.println(i);
        }
        System.out.println(Day.MONDAY.ordinal());// give the index
    }
}
/*

Enum constants are SINGLETON
Enums are used when we want to have a fixed set of values
An enum is actually a class and each enum constant is actually an object

Something similar to

final class Day {

    public static final Day MONDAY = new Day();

    public static final Day TUESDAY = new Day();

    public static final Day WEDNESDAY = new Day();

    private Day() {

    }
}
 */
