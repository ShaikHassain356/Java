package java2.InterviewQuestions;

public class SwappingOfTwoNumbersUsingThirdVariable {
    public static void main(String[] args) {
        int x=100, y=200;
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping values of x and y are: x="+x+"y="+y);
    }
}
