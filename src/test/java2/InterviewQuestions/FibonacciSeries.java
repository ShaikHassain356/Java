package java2.InterviewQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int a=0,b=1;
        for (int i=0;i<num;i++)
        {
            System.out.print(a+",");
            int next =a+b;
            a=b;
            b=next;

        }
    }
}