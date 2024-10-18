package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args) {
        //mutable-- if a operation that able to change the original variable value
        int a[]={10,40,30,20,60,50};
        System.out.println("Before soring:"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting:"+ Arrays.toString(a));

        //immutable--if a operation not able to change the original variable value

        String b="Hassain";
        System.out.println(b);
        b.concat("Shaik");
        System.out.println(b);

        //String is a mutable object
        //StringBuffer is a Immutable object
        //StringBuilder is a Immutable object

    }
}
