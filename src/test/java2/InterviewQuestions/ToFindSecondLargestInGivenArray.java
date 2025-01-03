package java2.InterviewQuestions;

public class ToFindSecondLargestInGivenArray {
    public static void main(String[] args) {
        int a[]={100,555,454,455,545,235,759};
        int largest=0;
        int secondlargest=0;

        for (int i=0;i<a.length;i++)
        {
            if (a[i]>largest)
            {
                secondlargest=largest;
                largest=a[i];
            } else if (a[i]>secondlargest)
            {
                secondlargest=a[i];

            }
        }
        System.out.println("The secondlargest number in the given array is: "+secondlargest);
        System.out.println("The largest number in the given array is: "+largest);
    }
}
