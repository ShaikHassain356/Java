package String;

import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args) {
        //mutable-- operation that changes the original values of a variable
        int a[]={10,60,30,40,50};
        System.out.println("Before sorting"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After sorting"+Arrays.toString(a));

        //Immutable--operation that not changes the original value of a variable
        String s="Hassain";
        s.concat("Shaik");
        System.out.println(s);
    }
}
