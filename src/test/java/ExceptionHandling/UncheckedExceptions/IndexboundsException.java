package ExceptionHandling.UncheckedExceptions;

import java.util.Scanner;

public class IndexboundsException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("please enter the position that you want to fill");
        int pos= sc.nextInt(); //if we want to fill position beyond the index, we will get ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        System.out.println("please enter the values");
        int value= sc.nextInt();
        a[pos]=value;
        System.out.println(a[pos]);

        System.out.println("The program is succesfully executed");
        System.out.println("The program is succesfully exited");
    }
}
