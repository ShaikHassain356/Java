package java2.OOPsConcepts.MainMethodOverloading;

public class MainMethodOverloading {
    void main(int i)
    {
        System.out.println(i);
    }

    void main(String name)
    {
        System.out.println(name);
    }

    void main(String surname, String area)
    {
        System.out.println(surname+area);
    }

    public static void main(String[] args) {
        MainMethodOverloading mo=new MainMethodOverloading();
        mo.main(1000);
        mo.main("Hassain");
        mo.main("Hassain"+"Kandrika");
    }
}
