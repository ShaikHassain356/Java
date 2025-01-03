package java2.Arrays;

import java.util.Scanner;

public class ToReverseANumberGivingNumAtRunTime {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int reqnum = sc.nextInt();
        int tempnum =0;
        while (reqnum!=0)
        {
           int j= reqnum%10;
           tempnum =tempnum*10+j;
           reqnum= reqnum/10;
        }
        System.out.println("After reversing a number is:"+tempnum);
    }
}
