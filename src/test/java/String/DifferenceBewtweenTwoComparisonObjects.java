package String;

public class DifferenceBewtweenTwoComparisonObjects {
    public static void main(String[] args) {
        //case 1
        /*
        String s1 ="Hassain";
        String s2 ="Hassain";
        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s2)); //true
         */

        //case 2
        /*
        String s1="Hassain";
        String s2= new String("Hassain");
        System.out.println(s1==s2); // false//== compares the objects
        System.out.println(s1.equals(s2)); //true  //.equals() compares the values of the objects
        */

        //case 3

        /*
        String s1=new String("Hassain");
        String s2=new String("Hassain");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true

        */

        //case4

        String s1 ="Hassain";
        String s2=new String("Hassain");
        String s3=s2;

        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true

        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s3)); //true

        System.out.println(s2==s3); //true  as s3 also refering to same object
        System.out.println(s2.equals(s3));

    }
}