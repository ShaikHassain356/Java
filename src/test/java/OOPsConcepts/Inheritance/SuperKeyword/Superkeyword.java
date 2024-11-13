package OOPsConcepts.Inheritance.SuperKeyword;

class colour {
    String colour = "black";
}

class colourvalue extends colour {
    String colour = "red";

    void displaycolour1() {
        System.out.println(colour);
    }
}

public class Superkeyword {
    public static void main(String[] args) {
        colourvalue c = new colourvalue();
        c.displaycolour1();

    }
}
