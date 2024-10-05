package Assignements;

public class ToCountNumberOfDigitsInANumber {
    public static void main(String[] args) {
        int num = 3658979;
        int count =0;
        int temp = num;

        while (temp !=0)
        {
            temp = temp/10;
            count++;
        }
        System.out.println(count);
    }
}
