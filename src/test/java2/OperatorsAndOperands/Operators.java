package java2.OperatorsAndOperands;

public class Operators {
    public static void main(String[] args) {
        // 1) Arithematic operators + - * / %
        int a,b;
        a=20;
        b=10;
        System.out.println("sum of the operands is: "+(a+b));
        System.out.println("subtraction of operands is: "+(a-b));
        System.out.println("multiplication of operands is: "+(a*b));
        System.out.println("Division of operands is: "+(a/b)); // this will return the quotient
        System.out.println("Percentile of the operands is: "+(a%b)); // this will return the remainder

        // 2) Relational or comparison operators > >= < <= != ==  this operator always reyurn a boolean value
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        System.out.println(a==b);

        // 3) Logical OperatorsAndOperands.Operators && || !, this always returns boolean value and this always works between two boolean values

        boolean x= true;
        boolean y= false;

        System.out.println("logic of both operands is: "+(x&&y));
        System.out.println(x||y);
        System.out.println(!x);
        System.out.println(!y);

        boolean c = a<b; //false
        boolean d = a>b; //true
        System.out.println(c&&d); //false

        System.out.println((10<20) && (20>10));

        // 4) Increment and Decrement operators ++ --
        //case1 pre increment
        int a1 = 10;
         a1++;  // a1=a1+1;
        System.out.println(a1);

        // case2 post increment

        int b1 = 20;
        int result = b1++;
        System.out.println(result); // as it will assign the b1 value to variable result then  it will increment
        System.out.println(b1);

        // case3

        int c1 =20;
        int actual = ++c1;
        System.out.println(actual);
        System.out.println(c1);

        //Decrement
        // case1
        int d1 =10;
        d1--; // d1 = d1-1
        System.out.println(d1);

        //case2
        int d2 =20;
        int resul = d2--;
        System.out.println(resul);
        System.out.println(d2);

        //case3

        int e =20;
        int res = --e;
        System.out.println(e);

        int z=10;
        // if we want to increase the z value, we will write the expression like this below
        //z=z+5; instead of the using this expression we can use assignment operator like this
        //z+=5;
        //z-=10;
        z*=10;
        System.out.println(z);

        //6) comparison of 2 values using terinary operator

        /*example1
        int h=20, j=30;
        int y1 = (h>j)?h:j;*/
        //example 2
        //int y1 =(1==1)?100:200;
        //int y1 =(1==2)?100:200;
        int age = 16;
        String voteperson = (age>=18)?"Eligible":"Not-Eligible";
        System.out.println(voteperson);

        /*Urnary operator, one variable recuired
        Binary operator, two variable required
        Terinary operator,three variable are required*/
        
        /*int h=20, j=30;
        if (h<j)
        {
            System.out.println(h);
        }
        else
        {
            System.out.println(j);
        }*/
    }
}
