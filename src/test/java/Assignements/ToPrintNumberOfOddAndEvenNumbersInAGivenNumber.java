package Assignements;

public class ToPrintNumberOfOddAndEvenNumbersInAGivenNumber {
    public static void main(String[] args) {
        int num = 568974;
        int evencount =0;
        int oddcount =0;
        while (num!=0)
        {
            int digit = num%10;
            if (digit%2==0)
            {
                evencount++;
            }
            else
            {
            oddcount++;
            }
            num = num/10;
        }
        System.out.println("Even number count is: "+evencount);
        System.out.println("Odd numbers count is: "+oddcount);

    }
}
