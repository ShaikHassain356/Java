package java2.InterviewQuestions;

import java.util.Scanner;

public class ToFindWhetherGivenStringIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
        String actual=s;
        String reversed="";

        for (int i=s.length()-1;i>=0;i--)
        {
            reversed=reversed+s.charAt(i);
        }


        if (actual.equals(reversed))
        {
            System.out.println("given string is palindrome");
        }
        else
        {
            System.out.println("given string is not a palindrome");
        }

    }
}
