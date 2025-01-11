package java2.AccessModifiers.Protected.Package2;

import java2.AccessModifiers.Protected.package1.dummy2;

public class protectedclass extends dummy2 {
    public static void main(String[] args) {
        protectedclass pc=new protectedclass();
        System.out.println(pc.s);
        pc.m1();
    }
}
