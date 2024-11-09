package OOPsConcepts.PolymorphismMethodOverloading;

public class adderMain {
    public static void main(String[] args) {
        adder obj = new adder();
        obj.add();
        obj.add(100,900);
        obj.add(200,12.06);
        obj.add(100,200,300);
    }
}
