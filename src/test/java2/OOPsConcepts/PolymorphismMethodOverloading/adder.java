package java2.OOPsConcepts.PolymorphismMethodOverloading;

public class adder {

    int a=100,b=200;

    void add()
    {
        System.out.println(a+b);
    }

    void add(int x, int y)
    {
        System.out.println(x+y);
    }

    void add(int x, double y)
    {
        System.out.println(x+y);
    }

    void add(double x, int y)
    {
        System.out.println(x+y);
    }

    void add(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }
}
