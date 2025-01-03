package java2.InterviewQuestions;

import java.util.Scanner;

public class RemoveWhiteSpacesFromAStringUsingBuiltInMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
        String s2= s.replaceAll("\\s",""); // \\s matches any whitespace character (spaces, tabs, newlines, etc.).
        System.out.println(s2);
    }
}
