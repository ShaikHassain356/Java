package java2.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int a[]={1,4,3,5};
        int n= a.length+1;//to calculate the total number of elements
        int sumofnumbers=n*(n+1)/2;//sum of first n natural numbers
        int sumofArray=0;
        for (int i=0;i<a.length;i++)
        {
            sumofArray+=a[i];
        }
        int missingnumber = sumofnumbers-sumofArray;
        System.out.println("missingnumber is: "+missingnumber);


    }
}
