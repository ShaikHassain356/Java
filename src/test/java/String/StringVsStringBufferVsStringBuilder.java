package String;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {

        // String is immutable
        String s ="Hassain";
        s.concat("Shaik");
        System.out.println(s);

        // StringBuffer is mutable

        StringBuffer s1=new StringBuffer("Hassain");
        s1.append("Shaik");
        System.out.println(s1);

        //StringBuilder is mutable
        StringBuilder s2=new StringBuilder("Hassain");
        s2.append("Shaik");
        System.out.println(s2);
    }
}
