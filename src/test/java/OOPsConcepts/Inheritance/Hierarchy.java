package OOPsConcepts.Inheritance;

class parent{
    void print(int a)
    {
        System.out.println(a);
    }
}

class child1 extends parent{
    void show(int b)
    {
        System.out.println(b);
    }
}

class child2 extends parent{
    void display(int c)
    {
        System.out.println(c);
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        child1 ch1=new child1();
        ch1.print(100);
        ch1.show(200);

        child2 ch2=new child2();
        ch2.print(600);
        ch2.display(700);

    }
}
