package OOPsConcepts.Inheritance.SuperKeyword;

class colour {
    String colour = "black";
    void dis()
    {
        System.out.println("parent class");
    }
}

class colourvalue extends colour {
    String colour = "red";

    void displaycolour1() {
        System.out.println(super.colour);
    }
    void dis()
    {
        //System.out.println("child class");
        super.dis();
    }
}

public class Superkeyword {
    public static void main(String[] args) {
        colourvalue c = new colourvalue();
        c.displaycolour1(); //as we added superkeyword immediate parent class variable will be printed
        c.dis(); //parent class, as we used super keyword in child class of dis method, immediate parent class method will be executed

    }
}
