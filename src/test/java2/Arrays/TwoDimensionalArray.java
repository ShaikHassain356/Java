package java2.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Declaration approach 1

        /*int a[][]=new int [3][2];
        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;

        System.out.println(a[2][0]);*/

        //Approach 2

        int a[][]= {{100,200},
                    {300,400},
                    {500,600}};
        System.out.println("length of rows: "+a.length);
        System.out.println("length of columns: "+a[1].length); //here a[1] represents the no of colmns in row 1 we can also use other row no's
        System.out.println(a[2][1]); // to retrieve one values
         // to retrieve multiple values using for loop

        for (int r=0;r<a.length;r++)
        {
            for (int c=0;c<a[0].length;c++)
            {
                System.out.println(a[r][c]);
            }
        }
        System.out.println("hello");
    }
}
