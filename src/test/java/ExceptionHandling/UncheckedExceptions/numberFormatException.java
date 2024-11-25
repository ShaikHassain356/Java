package ExceptionHandling.UncheckedExceptions;

import java.util.Scanner;

public class numberFormatException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the string");
        String s= sc.nextLine();//if we provide the input that is in text string we will get numberFormatException: For input string: "fsfsff"
        int i= Integer.parseInt(s);
        System.out.println(i);

        System.out.println("The program is succesfully executed");
        System.out.println("The program is succesfully exited");
    }
}
