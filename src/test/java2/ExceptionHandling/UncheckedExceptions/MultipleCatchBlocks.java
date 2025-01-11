package java2.ExceptionHandling.UncheckedExceptions;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //this approach we will use if we dont know what kind of exception we get
        System.out.println("Please enter the number");
        int num= sc.nextInt();
        try {
            int output=100/num;
            System.out.println(output);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Handled");
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Handled");
            System.out.println(e.getMessage());
        }

        System.out.println("The program is succesfully executed");
        System.out.println("The program is succesfully exited");
    }
}
