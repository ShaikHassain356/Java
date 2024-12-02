package InterviewQuestions;


import java.util.Scanner;

public class SwappingOfTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        x= sc.nextInt();
        System.out.println("enter the value of y");
        y=sc.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("after swapping the values are: x="+x+"y="+y);


    }
}
