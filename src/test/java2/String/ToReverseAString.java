package java2.String;

public class ToReverseAString {
    public static void main(String[] args) {
        //Approach1, using length() and chartAt() methods
        /*String s="ShaikHassain";
        String revstring ="";
        for (int i=s.length()-1;i>=0;i--)
        {
            revstring = revstring+ s.charAt(i);

        }
        System.out.println(revstring);
    }*/

        //Approach2, by converting string into char array

       /* String s= "ShaikHassain";
        String revstring ="";
        char a[]=s.toCharArray();
        for (int i=a.length-1;i>=0;i--)
        {
            revstring = revstring+a[i];
        }
        System.out.println(revstring);*/

        //Approach3, by using string buffer built in method

        StringBuffer s= new StringBuffer("ShaikHassain");
        System.out.println(s.reverse());

        //Approach4, by using string builder built in method

        StringBuilder s2= new StringBuilder("ShaikHassain");
        System.out.println(s2.reverse());
    }
}
