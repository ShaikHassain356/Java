package java2.OOPsConcepts.ConstructorOverloading;

public class BoxMain {
    public static void main(String[] args) {
        Box obj =new Box();
        System.out.println(obj.volume());

        Box obj2= new Box(10.0,20.25,36.54);
        System.out.println(obj2.volume());

        Box obj3=new Box(10.35);
        System.out.println(obj3.volume());
    }
}
