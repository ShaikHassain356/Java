package String;

import java.util.Scanner;

public class ToFindWhetherAStringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the string input");
        String actual = sc.nextLine();
        String revstring="";
        for (int i=actual.length()-1;i>=0;i--)
        {
            revstring =revstring+actual.charAt(i);
        }
        System.out.println(revstring);
        if (revstring.equalsIgnoreCase(actual))
        {
            System.out.println("Given string is a palindrome");
        }
        else
        {
            System.out.println("given string is not a palindrom");
        }
    }
}
