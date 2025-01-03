package java2.Arrays;

import java.util.Arrays;

public class ArraySortingInAscendingOrder {
    public static void main(String[] args) {
        int a[]= {1,6,1,300,200,100,50,60,900,600,69,78};
        //without for loop reading all the values in array using predefined class array and method tostring()
        System.out.println("Array before sorting: "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array after sorting: "+Arrays.toString(a));

    }
}
