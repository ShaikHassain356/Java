package String;

public class StringMethods {
    public static void main(String[] args) {
        String s="Hassain";
        //1)Finding the length of a string using lenth()
        int length= s.length();
        System.out.println(length);
        System.out.println(s.length());
        //2)concat() of strings
        String s1="Shaik";
        String s2="Hassain";
        String s3=s1+s2;
        System.out.println(s3);
        String s4= s1.concat(s2);
        System.out.println(s4);
        System.out.println(s1.concat(s2));
        System.out.println(s1+s2);
        System.out.println("Shaik"+"Hassain");
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3));
        //3)trim() method used to remove the spaces

        String t="   Hassain   ";
        System.out.println("Before trimming:"+t);
        String aftertrimmed= t.trim();
        System.out.println("After trimming:"+aftertrimmed);
        System.out.println(t.trim());

        //4)charAt() methods finds character at particular index

        String a="Hassain";
        char aftervalue = a.charAt(1);
        System.out.println(aftervalue);
        System.out.println(a.charAt(6));

        //5)contains() finds whether a particular string is a part of main string or not
        //this always returns a boolean value

        String a1="Hassain";
        String a2="Has";
        System.out.println(a1.contains(a2));

        /*6)equals() and equalsIgnoreCase() both are used to compare the strings, only difference is
        Ignorecase will ignore the case sensitive*/

        String b1="Hassain";
        String b2="Hassain";
        boolean b= b1.equals(b2);
        System.out.println(b);
        System.out.println(b1.equals(b2));
        String c1="Hassain";
        String c2="hassain";
        System.out.println(c1.equals(c2));
        System.out.println(c1.equalsIgnoreCase(c2));// this will ignore the case sensitive
    }
}
