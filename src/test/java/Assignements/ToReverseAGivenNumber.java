package Assignements;

public class ToReverseAGivenNumber {
    public static void main(String[] args) {
        int number = 123456789;
        int reversenum =0;
        while (number!=0)
        {
            int digit = number%10; //Extract the last digit
            reversenum = reversenum*10+digit; // append the last digit to the variable reversenum
            number= number/10; // to remove last digit from actual number

        }
        System.out.println("Reverse number is: "+reversenum);
    }
}
