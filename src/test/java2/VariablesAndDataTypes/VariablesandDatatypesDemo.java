package java2.VariablesAndDataTypes;

public class VariablesandDatatypesDemo {
    public static void main(String[] args) {
       //approach1
        /* int a; //declaration
        a=10; //assignment
        int b=10;
        System.out.println(a+b);
        a=20; // as this is variable, it can always varies
        System.out.println(a+b);*/
//approach 2
        /*int a,b,c; //we can also declare like this if all the variables belongs to same data types
        a=10;
        b=10;
        c=10;
        System.out.println(a+b+c);*/
        //approach 3
        int a=10,b=10,c=10;
        System.out.println("the values of all the variables are:" +(a+b+c));
        System.out.println("all the values are " +(a+" "+b+" "+c));
        //literal we have to give only 2 data types  l for long and f for float
        long z = 16554544564l;
        float l =155454546545454545545454f;
        System.out.println(l);
        float k = 10.3255454f;
        System.out.println(k);
        double flour_price = 60.36;
        System.out.println(flour_price);
        char grade = 'A';
        System.out.println(grade);
        String name2 ="Hassain2";
        System.out.println(name2);
        boolean bl = true;
        System.out.println(bl);
        final int v =100; // final is a constant we cannot change the value
        System.out.println(v);
        String j = "Hassain3";
        j="Hassain4";
        System.out.println(j);

    }

    public static class FirstJavaProgram {
        public static void main(String[] args) {
            //System.out.printf("Hello Hassain");
            System.out.println("Hello Hassain");
            System.out.println("Hello Hassain");
            System.out.println(10+20);
            for (int i=0;i<=5;i++)
            {
                int sum=0;
                sum = sum+i;
                System.out.println(sum);
            }
        }
    }
}
