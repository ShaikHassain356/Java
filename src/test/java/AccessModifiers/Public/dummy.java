package AccessModifiers.Public;
import String.dummyinstring;

public class dummy {
    public static void main(String[] args) {
        dummyinstring dst=new dummyinstring();//we can access any variable and methods across packages in public access modifier
        System.out.println(dst.s);//as these variable and methods imported from dummyinstring class from String package
        dst.m1();
    }

}
