package InterviewQuestions;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int actualnum= num;
        double result=0;
        int digits=String.valueOf(num).length();

        while (num!=0)
        {
            int digit= num%10;
            result=result+Math.pow(digit,digits);
            num=num/10;

        }
        System.out.println(result);

        if (result==actualnum)
        {
            System.out.println("Given number is a amstrong number: "+actualnum);
        }
        else
        {
            System.out.println("Given number is not a amstrong number: "+actualnum);
        }
    }
}
