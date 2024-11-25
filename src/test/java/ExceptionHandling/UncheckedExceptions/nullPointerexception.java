package ExceptionHandling.UncheckedExceptions;

public class nullPointerexception {
    public static void main(String[] args) {
        String s=null; // we try to perform operations on null we will get ExceptionHandling.UncheckedExceptions.nullPointerexception.main(nullPointerexception.java:8)
        int i= s.length();
        System.out.println(i);

        System.out.println("The program is succesfully executed");
        System.out.println("The program is succesfully exited");
    }
}
