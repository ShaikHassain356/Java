package ControlStatements;

public class ControlStatements_JumpingStatements {
    public static void main(String[] args) {
        //Trying to print 0-10 values but if i value is 8 we need to break the loop
        /*for (int i=0;i<=10;i++)
        {
            if (i==8)
            {
                break;
            }
            System.out.println(i);
        }*/

        //Trying to print 0-10 values but we need to ignore the 2,5,7 values

        for (int i=0;i<=10;i++)
        {
            if (i==2||i==5||i==7)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
