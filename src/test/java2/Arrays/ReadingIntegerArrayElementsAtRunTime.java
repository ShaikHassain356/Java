package java2.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReadingIntegerArrayElementsAtRunTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a[]=new Integer[6];
        for (int i=0;i<a.length;i++)
        {
            System.out.println("Enter a number for the position "+i+":");
            a[i]= sc.nextInt();
        }
        System.out.println("Array of elements: "+ Arrays.toString(a));
        System.out.println(a[5]);
        Arrays.sort(a);
        System.out.println("After sorting in ascending order:"+Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("After sorting in Descending order: "+Arrays.toString(a));
    }
}
