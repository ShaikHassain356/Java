package ExceptionHandling.UncheckedExceptions;

import java.util.Scanner;

public class ArithematicException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= sc.nextInt();
        int output=100/num; //if we provide 0 as input it will throw ArithmeticException: / by zero
        System.out.println(output);

        System.out.println("The program is succesfully executed");
        System.out.println("The program is succesfully exited");
    }
}
