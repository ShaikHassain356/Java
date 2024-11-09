package OOPsConcepts.Inheritance;

class insect{
    String insect="Bug";
    void m1()
    {
        System.out.println(insect);
    }
}

class snake extends insect{
    String snake="Cobra";

    void m2()
    {
        System.out.println(snake);
    }

}

class eagle extends snake{
    String eagle="White Eagle";
    void m3()
    {
        System.out.println(eagle);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        eagle eobj =new eagle();
        System.out.println(eobj.eagle);
        System.out.println(eobj.snake);
        System.out.println(eobj.insect);

        eobj.m1();
        eobj.m2();
        eobj.m3();

    }
}
