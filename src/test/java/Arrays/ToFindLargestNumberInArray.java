package Arrays;

public class ToFindLargestNumberInArray {
    public static void main(String[] args) {
        int a[]={100,3698,3445,87445,4445};
        int largest =a[0]; //lets assume values at a[0] is largest
        for (int i=1;i<a.length;i++)
        {
            if (a[i]>largest)
            {
                largest = a[i];
            }
        }
        System.out.println("the largest number in the array is: "+largest);
    }
}
