package InterviewQuestions;

import java.util.Scanner;

public class ToRemoveWhiteSpacesFromAStringWithoutUsingRemoveAllMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (!Character.isWhitespace(ch))
            {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString()); // Convert StringBuilder to String and print the result

    }
}
