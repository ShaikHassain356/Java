package java2.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortingOfIntegerArrayInReverseOrder {
    public static void main(String[] args) {
        int a[]={100,200,900,300,600,500};
        System.out.println("Berfore reversing the order: "+ Arrays.toString(a));
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.println((a[i]));
        }


    }
}
