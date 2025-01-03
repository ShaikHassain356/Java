package java2.Assignements;

public class SumofDigitsOfANumber {
    public static void main(String[] args) {
        int num = 123456;
        int temp =0;
        while (num!=0)
        {
            int digit = num%10;
            temp = temp+digit;
            num=num/10;

        }
        System.out.println("Sum of all the digits is: "+temp);
    }
}
