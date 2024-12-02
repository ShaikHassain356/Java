package ControlStatements;

public class ControlStatements_LoopingStatements_WhileLoop {
    public static void main(String[] args) {
        //Examp1: to print 0-10 numbers using while loop
        /*int i=0;
        while (i<=10)
        {
            System.out.println(i);
            i++;
        }*/

        //Examp2: to print 10-0 numbers using while loop
        /*int i =10;
        while (i>=0)
        {
            System.out.println(i);
            i--;
        }*/

        //Examp3: To print hello message 10 times

        /*int i=10;
        while (i>=0)
        {
            System.out.println("Hello-"+i);
            i--;
        }*/

        //Examp4: To print even numbers from 1-20
        //Approach1
        /*int i=2;
        while (i<=20)
        {
            System.out.println(i);
            i=i+2;
        }*/

        //Approach2 using If condition

        /*int i =1;
        while (i<=20)
        {
            if (i%2==0)
            {
                System.out.println(i);
                i++;
            }
        }*/

        //Examp5: to print even and odd numbers from 1-20 with odd or even names

        int i =1;
        while (i<=20)
        {
            if (i%2==0)
            {
                System.out.println(i+"-Even number");
            }
            else
            {
                System.out.println(i+"-Odd number");
            }
            i++;

        }



    }
}
