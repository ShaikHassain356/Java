package java2.OOPsConcepts.Abstraction;

interface shape{
    int i=100; //by default all the variables in interface are final and static variables
    int k=200; //by default all the variables in interface are final and static variables

    void circle();

    default void rectangle()
    {
        System.out.println("This is a rectangle--default method");
    }

    static void square()
    {
        System.out.println("This is a square--static method");
    }

}

public class Interfacedemo implements shape {

    public void circle()
    {
        System.out.println("This is abstract method--after implementation");
    }

    void triangle()
    {
        System.out.println("This is a triangle");
    }


    public static void main(String[] args) {

        //scenario 1
/*
        Interfacedemo ifdm=new Interfacedemo();
        ifdm.circle(); //calling the abstract method using object name
        ifdm.rectangle();
        shape.square(); //we can call directly static method using the Interface name without object name
        ifdm.triangle();
*/

        //scenario 2
        shape ifdm= new Interfacedemo(); //interface shape variable(ifdm) can store the object of class Interfacedemo
        ifdm.circle();
        ifdm.rectangle();
        shape.square();
        //we cannot access the triangle method because not available in the interface

        System.out.println(shape.i);
        System.out.println(shape.k);
        System.out.println(shape.i*shape.k);

    }
}
