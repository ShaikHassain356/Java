package ControlStatements;

public class ControlStatements_ConditionalStatements_ForLoop {
    public static void main(String[] args) {
        // Examp1: to print numbers from 1-10

        /*for (int i=1; i<=10; i++)
        {
            System.out.println(i);
        }*/

        //Examp2: To print even numbers from 1-10

        /*for (int i=2; i<=10; i+=2)
        {
            System.out.println(i);
        }*/

        //Examp3: To print even and odd numbers from 1-10 with odd and even names using for loop

        /*for (int i=1; i<=10;i++)
        {
            if (i%2==0)
            {
                System.out.println(i+"-Even number");
            }
            else
            {
                System.out.println(i+"-Odd number");
            }
        }*/

        //Examp4: To print numbers from 10-1

        for (int i=10;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}
