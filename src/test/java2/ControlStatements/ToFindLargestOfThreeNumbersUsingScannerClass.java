package java2.ControlStatements;

import java.util.Scanner;

public class ToFindLargestOfThreeNumbersUsingScannerClass {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        a= sc.nextInt();
        System.out.println("Enter the value of b");
        b= sc.nextInt();
        System.out.println("Enter the value of c");
        c= sc.nextInt();

        if (a>b && a>c)
        {
            System.out.println("a is larger: "+a);
        }
        else if (b>a && b>c)
        {
            System.out.println("b is larger: "+b);
        }
        else
        {
            System.out.println("c is larger: "+c);
        }
    }
}
