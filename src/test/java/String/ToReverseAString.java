package String;

import org.openqa.selenium.json.JsonOutput;

public class ToReverseAString {
    public static void main(String[] args) {

        //Approach 1, using length() and charAt() methods
         /* String actual ="Hassainshaik";
          String temp ="";
          for (int i=actual.length()-1;i>=0;i--)
          {
              temp = temp+actual.charAt(i);
          }
        System.out.println(temp);



    }*/
        //Approach 2, by converting string into character array
       /* String s="HassainShaik";
        String revstring ="";
        char a[]=s.toCharArray();
        for (int i=a.length-1;i>=0;i--)
        {
            revstring = revstring+a[i];
        }
        System.out.println(revstring);
    }*/

        //Approach 3, by using string buffer

       /* StringBuffer s = new StringBuffer("HassainShaik");
        System.out.println(s.reverse());*/

        //Approach 4, by using string builder
        StringBuilder s=new StringBuilder("HassainShaik");
        System.out.println(s.reverse());

    }
}
