package java2.Arrays;

import java.util.Scanner;

public class ToFindSmallestNumberInArrayDuringRunTime {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a.length;i++)
        {
            System.out.println("Enter the number at the position"+i+":");
            a[i]= sc.nextInt();
        }
        int smallest =a[0];
        for (int i=1;i<a.length;i++)
        {
            if (a[i]<smallest)
            {
                smallest=a[i];
            }
        }
        System.out.println("smallest number in the provided array is: "+smallest);
    }
}
