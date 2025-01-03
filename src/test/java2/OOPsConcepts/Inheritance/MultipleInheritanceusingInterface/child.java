package java2.OOPsConcepts.Inheritance.MultipleInheritanceusingInterface;

public class child extends ParentClass implements I1,I2{ //this is also called hybrid inheritance

    public void m1()
    {
        System.out.println(i);
    }

    public void m2()
    {
        System.out.println(j);
    }

    public static void main(String[] args) {

        child ch=new child();
        ch.m1();
        ch.m2();
        System.out.println(ch.m3());


    }
}
