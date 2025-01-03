package java2.Arrays;

public class NumberOfRepetitionsInAArray {
    public static void main(String[] args) {
        int a[][]={{100,200,300},
                   {100,300,980},
                   {100,900,300}};
        int reqnum = 300;
        int k=0;
        boolean allvariablesreaded= false;
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[1].length;j++)
            {
                if (a[i][j]==reqnum)
                {
                    k=k+1;
                    allvariablesreaded=true;
                }
            }
        }
        if (allvariablesreaded==true)
        {
            System.out.println("number of times that required number repeated is:" + k);
        }
        else
        {
            System.out.println("number that required is not in the array list");
        }
    }
}
