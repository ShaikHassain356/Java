package java2.OOPsConcepts;

public class MethodsTypes {

    //1. No params No return values
    void m1()
    {
        System.out.println("Hi Hassain");
    }

    //2.No params return value
     String m2()
     {
         return ("Hi hello Hassain");
     }

     //3.Take params no return value

    void m3(String name, int age, char grade)
    {
        System.out.println(name+"  "+age+"  "+grade  );
    }

    //4.take params and return value
    String m4(String name, int age, char grade)
    {
        return (name +"  "+age+"  "+grade);
    }
}
