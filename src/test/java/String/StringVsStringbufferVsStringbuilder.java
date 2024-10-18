package String;

public class StringVsStringbufferVsStringbuilder {
    public static void main(String[] args) {
        //String is mutable
        String s="Hassain";
        s.concat("Hassain");
        System.out.println(s);

        //StringBuufer -- immutable

        StringBuffer s1=new StringBuffer("Hassain");
        s1.append("Shaik");
        System.out.println(s1);

        //StringBuilder--immutable

        StringBuilder s2= new StringBuilder("Hassain");
        s2.append("Shaik");
        System.out.println(s2);

    }
}
