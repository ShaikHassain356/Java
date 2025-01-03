package java2.TypeCasting;

class parent{
    String s="Hassain";
    void m1()
    {
        System.out.println("This is the method m1 from parent class");
    }
}

class child extends parent{
    int i=100;
    void m2()
    {
        System.out.println("This the method m2 from child class");
    }
}

public class TypeCastingObject {
    public static void main(String[] args) {
        /*
        child c=new child();
        System.out.println(c.s);
        c.m1();
        System.out.println(c.i);
        c.m2();

         */

        /*parent p=new child(); //upcasting

        System.out.println(p.s);
        p.m1();
        //System.out.println(p.i); //not accessible
        //p.m2(); //not accessible
         */

        parent p=new parent();
        child c= (child)p; //down casting, we wont get compilation error, but we will get at run time

        System.out.println(c.s);
        c.m1();
        System.out.println(c.i);
        c.m2();

    }
}
