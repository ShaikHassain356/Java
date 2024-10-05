package Assignements;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 656;
        int originalnumber = num;
        int reversenum = 0;
        while (num!=0)
        {
            int digit= num%10;
            reversenum = reversenum*10+digit;
            num=num/10;
        }
        System.out.println("Reversed number: "+reversenum);
        if (reversenum == originalnumber)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome number");
        }
    }
}
