package Arrays;

public class SumOfElementsInAArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int temp =0;
        for (int i=0;i<a.length;i++)
        {
            temp=temp+a[i];

        }
        System.out.println("sum of all the values is:"+temp);
    }
}
