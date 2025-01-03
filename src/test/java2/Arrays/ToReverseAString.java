package java2.Arrays;

public class ToReverseAString {
    public static void main(String[] args) {
          String actual ="Hassainshaik";
          String temp ="";
          for (int i=actual.length()-1;i>=0;i--)
          {
              temp = temp+actual.charAt(i);
          }
        System.out.println(temp);
    }
}
