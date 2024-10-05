package ControlStatements;

public class ControlStatements {
    public static void main(String[] args) {
        //1).conditional statements
        //a).If
        /*int age = 20;
        if (age>=18)
        {
            System.out.println("Person is eligible to vote");
        }*/

        //2).If else
        /*int age = 10;
        if (age>=18)
        {
            System.out.println("Person is eligible to vote");
        }
        else
        {
            System.out.println("Person is not eligible to vote");
        }*/
        //example 2 to find whether a number is even or odd number
        /*int a=30;
        if (a%2==0)
        {
            System.out.println("It is a even number");
        }
        else
        {
            System.out.println("It is a odd number");
        }*/

        //c).Nested if else
        //to find whether a number is positive, negative or zero

        /*int num =0;
        if (num>0)
        {
            System.out.println("It is a positive number");
        }
        else if (num<0)
        {
            System.out.println("It is a negative number");
        }
        else
        {
            System.out.println("It is Zero");
        }*/

        //example 2 to find the largest number among 3 numbers
        /*int a=40,b=20,c=30;
        if (a>b && a>c)
        {
            System.out.println("a is the largest number: "+a);
        }
        else if (b>a && b>c)
        {
            System.out.println("b is the largest number: "+b);
        }
        else
        {
            System.out.println("c is the largest number: "+c);
        }*/
        //example 3 to print weeks according to the number

        /*int weeknum =12;
        if (weeknum==1)
        {
            System.out.println("Sunday");
        }
        else if (weeknum==2)
        {
            System.out.println("Monday");
        }
        else if(weeknum==3)
        {
            System.out.println("Tuesday");
        }
        else if (weeknum==4)
        {
            System.out.println("Wednesday");
        }
        else if (weeknum==5)
        {
            System.out.println("Thursday");
        }
        else if (weeknum==6)
        {
            System.out.println("Friday");
        }
        else if (weeknum==7)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("Invalid week number");
        }*/

        //3).Nested if else

        /*if (true)
        {
            if (false)
            {
                System.out.println("Hassain");
            }
            else
            {
                System.out.println("Shaik");
            }

        }
        else
        {
            System.out.println("356");
        }*/
        //4).Switch statement objective is same as above

        int weeknum=15;

        switch (weeknum)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid week number");
        }



    }
}
