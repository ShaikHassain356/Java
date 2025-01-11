package java2.InterviewQuestions;

public class ToReverseAStringUsingStringInBuildFunctions {
    public static void main(String[] args) {
        String s="HassainJavaSelenium";
        String reverse="";
        for (int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        System.out.println("After reversing the string: "+reverse);
    }
}
