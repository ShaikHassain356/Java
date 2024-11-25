package TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        //upcasting
        //case1
        int i=10;
        float f=i;
        System.out.println(f);//10.0

        //case2
        float f1=10;
        double d=f1;
        System.out.println(d);//10.0

        //downcasting

        //case1
        long l=102;
        int i1= (int)l;
        System.out.println(i1);//102
        //case2
        double d2=10.00221155454;
        float f2=(float) d2;
        System.out.println(f2);//10.002212


    }
}
