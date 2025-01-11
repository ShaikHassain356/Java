package java2.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingStringDataArrays {
    public static void main(String[] args) {
        String s[]={"Ma","He","Ae","LA","Ja"};
        System.out.println("Before sorting: "+ Arrays.toString(s));
        Arrays.sort(s); //Ascending order
        System.out.println("AFter sorting: "+Arrays.toString(s));
        Arrays.sort(s,Collections.reverseOrder());
        System.out.println("After sorting in descending order: "+Arrays.toString(s));
    }
}
