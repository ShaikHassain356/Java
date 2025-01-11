package java2.InterviewQuestions;

import java.util.Scanner;

public class ToFindWhetherGivenNumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int actualnumber= num;
        int reversenumber=0;

        while (num!=0)
        {
            int digit=num%10; //this will extract the last digit
            reversenumber=reversenumber*10+digit;
            num =num/10; // this will remove the last digit
        }

        if (reversenumber==actualnumber)
        {
            System.out.println(actualnumber +" is a palindrome number");
        }
        else
        {
            System.out.println(actualnumber+" is not a palindrome number");
        }
    }
}
