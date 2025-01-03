package java2.Arrays;

import java.util.Scanner;

public class ReadingANumberAtRunTime {
    public static void main(String[] args) {
        System.out.println("Enter a number a:");
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        System.out.println("Enter a number b:");
        double b =sc.nextDouble();
        double c=a+b;
        System.out.println("Sum of the digits c="+c);
    }
}
