package java2.OOPsConcepts.Inheritance;

class ABC{
    void m1(int a)
    {
        System.out.println(a);
    }

    void m2(int b)
    {
        System.out.println(b);
    }
}

class XYZ extends ABC{
    void m1(int a) //overriding, as we do not change the declaration, only changes the implementation
    {
        System.out.println(a*a);
    }

    void m2(int a, int b)
    {
        System.out.println(a+b); //overloading, as we changed the implementation because as one of the rule, declartion should not be same for two methods
    }                            //as we extends the XYZ class to ABC
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {

        XYZ xyzobj=new XYZ(); //this will show 3 methods from both the classes
        xyzobj.m1(2);
        xyzobj.m2(100,200);
        xyzobj.m2(200);


        ABC abcobj = new ABC(); //this will show 2 methods as ABC class have only 2 methods
        abcobj.m1(1000);
        abcobj.m2(2000);
    }
}
