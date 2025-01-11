package java2.InterviewQuestions;

public class ToReverseAStringNotUsingStringInbuiltFunctions {
    public static void main(String[] args) {

        /*StringBuilder sb=new StringBuilder("shaikhassain");
        StringBuilder temp;
        temp= sb.reverse();
        System.out.println(temp);
        */

        StringBuffer sc=new StringBuffer("shaikhassain");
        StringBuffer sc2;
        sc2= sc.reverse();
        System.out.println(sc2);
    }
}
