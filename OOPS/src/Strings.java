public class Strings {
    public static void main(String []args){

        String s= new String("Tarak");
        // Creates object Tarak in String constant Pool as well in Heap

        String s2="Tarak";
        //Only in heap

        String s3="Tarak";

        System.out.println(s3==s);

         s3= s3+s2;
        // This is equivalent to creating a new String and pointing the s3 is pointing to that
        System.out.println(s3);

    }
}

//.equals () compares value only
// where has == compare reference as well

