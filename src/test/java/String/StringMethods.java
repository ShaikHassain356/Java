package String;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

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

        //5)contains() finds whether a particular string is a part of MainMethodOverloading string or not
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

        //7) replace() -- used to replace single or sequential of characters

        String d="Hassain";
        String e="Hello welcome to the selenium, u will learn selenium here";
        System.out.println(d.replace('a','c'));
        System.out.println(e.replace("selenium","java"));

        //8) substring() is used to capture the particular substring

        String f="Hassainshaik";
        //here staring index starts from 0 and ending index from 1
        System.out.println(f.substring(0,5));
        //9) toUpperCase() and toLowerCase() used to convert whole string into upper abd lower case

        String k="HassainShaik";
        System.out.println(k.toUpperCase());
        System.out.println(k.toLowerCase());

        //10)split() this will split the string into multiple parts based on delimeter
        String l="hassainshaik347@gmail.com";
        String l1[]= l.split("@");
        System.out.println(Arrays.toString(l1));
        System.out.println(l1[0]);

        String amount = "$20,36,36.00";
        //reuired output 20363600


        String amount1=amount.replace("$","");
        String amount2=amount1.replace(",","");
        String amount3=amount2.replace(".","");
        System.out.println(amount3);

        String m="abc,123@gmail";
         String m1[]= m.split(",");
         String m2[]= m1[1].split("@");
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));

        String n="abc 123";
        String n1[]= n.split(" ");
        System.out.println(Arrays.toString(n1));

        String o= "Hassain Shaik";
        //we need to check whether hassain is part of o string
        String o1= o.replace("H","h");
        System.out.println(o1.contains("hassain"));

        String g= "Hassain Shaik";
        //we need to check whether hassain is part of o string
        String g1= g.toLowerCase();
        System.out.println(g1.contains("hassain"));



    }
}
