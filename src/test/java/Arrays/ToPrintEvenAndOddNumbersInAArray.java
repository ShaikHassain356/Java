package Arrays;

public class ToPrintEvenAndOddNumbersInAArray {
    public static void main(String[] args) {
        int a[]={100,1,5654,7843,2365,213,453,236,456,74};
        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2==0)
            {
                System.out.println("even number:"+a[i]);
            }
            else
            {
                System.out.println("Odd number: "+a[i]);
            }
        }
    }
}
