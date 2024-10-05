package Assignements;

public class swappingofTwoNumbersusingTempVariable {
    public static void main(String[] args) {
        int a =100, b=200;
        System.out.println("Befor swaping the values: a=" +a+",b="+b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping the values: a="+a +",b="+b);


    }
}
