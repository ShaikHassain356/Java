package java2.ExceptionHandling.UncheckedExceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        String s=null;
        try {
            System.out.println(s.length());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception Handled");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block is executed");
            System.out.println("Hi hello");
        }
        System.out.println("statement after the finally block");
    }
}
