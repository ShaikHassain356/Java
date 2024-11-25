package ExceptionHandling.UncheckedExceptions;

import java.util.Scanner;

public class BypassOfMultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= sc.nextInt();
        try {
            int output=100/num;
            System.out.println(output);
        }
        catch (Exception e) //here exception is the parent class of all other exception classes
                //if we write multiple catch blocks length of the code will increase
        {
            System.out.println("Exception Handled");
            System.out.println(e.getMessage());
        }

        System.out.println("The program is succesfully executed");
        System.out.println("The program is succesfully exited");
    }
}
