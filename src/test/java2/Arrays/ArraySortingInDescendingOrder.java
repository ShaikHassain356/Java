package java2.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingInDescendingOrder {
    public static void main(String[] args) {
        Integer a[]= {1,6,1,300,200,100,50,60,900,600,69,78};
        /*Collections.reverseOrder() does not work with primitive data types like
        int[].It works with objects,specifically wrapper classes like Integer[].*/
        //without for loop reading all the values in array using predefined class array and method tostring()
        System.out.println("Array before sorting: "+ Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("Array after Descending order: "+Arrays.toString(a));

    }
}
