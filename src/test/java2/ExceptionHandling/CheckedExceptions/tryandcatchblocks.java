package java2.ExceptionHandling.CheckedExceptions;

public class tryandcatchblocks {
    public static void main(String[] args) {
        System.out.println("Program execution in progress");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Program execution completed");
    }
}
