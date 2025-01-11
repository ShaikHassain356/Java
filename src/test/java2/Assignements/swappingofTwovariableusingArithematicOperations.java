package java2.Assignements;

public class swappingofTwovariableusingArithematicOperations {
    public static void main(String[] args) {
        int a =1000, b=2000;
        System.out.println("Before swapping: a=" +a +",b="+b);
        a=a+b; //1000+2000 a becomes 3000
        b=a-b; //3000-2000 b becomes 1000
        a=a-b; //3000-1000 a becomes 2000
        System.out.println("After swapping: a="+a+",b="+b);

    }
}
