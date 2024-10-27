package OOPsConcepts.AssigningDataUsingMethods;

public class ConstructorDemo {

    int x,y;

    ConstructorDemo()  //Deafault constructor
    {
        x=100;
        y=200;
    }

    ConstructorDemo(int a, int b)  //parameterized constructor
    {
        x=a;
        y=b;
    }

    void printsum()
    {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        ConstructorDemo co =new ConstructorDemo();//as we not specified the parameters default constructor invoked
        co.printsum(); //300

        ConstructorDemo co2= new ConstructorDemo(200,500);// parameterized constructor will be invoked
        co2.printsum(); //700
    }
}
