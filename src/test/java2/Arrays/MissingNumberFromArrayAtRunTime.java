package java2.Arrays;

import java.util.Scanner;

public class MissingNumberFromArrayAtRunTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer a[]=new Integer[5];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the number at position "+i);
            a[i]=sc.nextInt();
        }
        int n=a.length+1;
        int sumofnumbers=n*(n+1)/2;
        int sumofarray=0;
        for (int j=0;j<a.length;j++)
        {
            sumofarray=sumofarray+a[j];
        }

        int missingnum=sumofnumbers-sumofarray;

        System.out.println("missing number is: "+missingnum);

    }
}
